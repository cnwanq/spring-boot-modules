package com.wanq.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {


    @RequestMapping("/hello")
    public String index() {
        return "Hello world!";
    }

}
