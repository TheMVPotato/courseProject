/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-09-25 12:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aside_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("\t<!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("\t<section class=\"sidebar\">\n");
      out.write("\t\t<!-- Sidebar user panel -->\n");
      out.write("\t\t<div class=\"user-panel\">\n");
      out.write("\t\t\t<div class=\"pull-left image\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/user2-160x160.jpg\"\n");
      out.write("\t\t\t\t\tclass=\"img-circle\" alt=\"User Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"pull-left info\">\n");
      out.write("\t\t\t\t<p>Tom</p>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> 在线</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("\t\t<ul class=\"sidebar-menu\">\n");
      out.write("\t\t\t<li class=\"header\">菜单</li>\n");
      out.write("\t\t\t<li id=\"admin-index\"><a\n");
      out.write("\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/main.jsp\"><i\n");
      out.write("\t\t\t\t\tclass=\"fa fa-dashboard\"></i> <span>首页</span></a></li>\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cogs\"></i>\n");
      out.write("\t\t\t\t\t<span>系统管理</span> <span class=\"pull-right-container\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li id=\"system-setting1\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do?page=1&pageSize=4\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 用户管理\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"system-setting2\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/findAll.do?page=1&pageSize=4\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 角色管理\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"system-setting3\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=1&pageSize=4\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 资源权限管理\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"system-setting4\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sysLog/findAll.do?page=1&pageSize=10\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 访问日志\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t</ul></li>\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\n");
      out.write("\t\t\t\t\t<span>基础数据</span> <span class=\"pull-right-container\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/product/find.do?page=1&pageSize=4\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 产品管理\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"system-setting5\"><a\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/orders/findAll.do?page=1&pageSize=4\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 订单管理\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- /.sidebar -->\n");
      out.write("</aside>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
