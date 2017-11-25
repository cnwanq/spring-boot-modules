package com.wanq.springboot.jdbc.controller;

import com.wanq.springboot.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello() throws Exception {
        return null;
    }


}
