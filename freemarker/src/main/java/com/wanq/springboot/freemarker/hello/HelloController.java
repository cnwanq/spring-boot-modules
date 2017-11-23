package com.wanq.springboot.freemarker.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("host", "http://www.wanq.me");
        model.addAttribute("class", "red");
        return "index";
    }
}
