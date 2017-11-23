package com.wanq.springboot.property.web;

import com.wanq.springboot.property.service.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    BlogProperties blogProperties;

    @RequestMapping("/hello")
    public String index() {
        return blogProperties.toString();
    }
}
