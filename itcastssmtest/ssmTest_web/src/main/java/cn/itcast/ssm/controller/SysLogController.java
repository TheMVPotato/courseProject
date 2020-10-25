package cn.itcast.ssm.controller;

import cn.itcast.ssm.Service.SysLogService;
import cn.itcast.ssm.domain.SysLog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")Integer page, @RequestParam(name = "size", required = true, defaultValue = "10") Integer size) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
       List<SysLog> sysLogList= sysLogService.findAll(page,size);
        PageInfo pageInfo=new PageInfo(sysLogList);
       modelAndView.addObject("pageInfo",pageInfo);
       modelAndView.setViewName("syslog-list");
        return modelAndView;
    }
}
