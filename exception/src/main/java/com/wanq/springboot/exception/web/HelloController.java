package com.wanq.springboot.exception.web;

import com.wanq.springboot.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw  new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("host", "http://www.wanq.me");
        return "index";
    }
}
