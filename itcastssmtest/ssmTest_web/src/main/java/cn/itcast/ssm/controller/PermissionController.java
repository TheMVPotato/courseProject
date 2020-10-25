package cn.itcast.ssm.controller;

import cn.itcast.ssm.Service.PermissionService;
import cn.itcast.ssm.domain.Permission;
import cn.itcast.ssm.domain.Role;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/permission")
public class PermissionController {
@Autowired
private PermissionService permissionService;
@RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        List<Permission>list=permissionService.findAll(page,size);
    PageInfo pageInfo =new PageInfo(list);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("permission-list");
        return modelAndView;

    }
//    添加
    @RequestMapping("/save.do")
    public String save(Permission permission) throws Exception {
        permissionService.save(permission);
        return "redirect:findAll.do";
    }

}
