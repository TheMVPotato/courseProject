package cn.itcast.ssm.controller;

import cn.itcast.ssm.Service.ProductService;
import cn.itcast.ssm.domain.Product;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
//    查询所有产品
    private ProductService productService;
    @RequestMapping("/find.do")
    @RolesAllowed("ADMIN")
 public ModelAndView finAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
     ModelAndView modelAndView=new ModelAndView();
     List<Product> all = productService.findAll(page,size);
        PageInfo pageInfo=new PageInfo(all);
     modelAndView.addObject("pageInfo",pageInfo);
     modelAndView.setViewName("product-list");
     return modelAndView;
 }
// 产品添加
@RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:find.do";
}
}
