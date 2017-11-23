package com.wanq.springboot.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public ModelAndView index(ModelMap modelMap) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("host", "http://www.wanq.me");
        modelAndView.addObject("class", "red");
        return modelAndView;
    }

    @RequestMapping("/index")
    public String index2(Model model) {
        model.addAttribute("host", "http://www.wanq.me");
        model.addAttribute("class", "red");
        return "index";
    }
}
