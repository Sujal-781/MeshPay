package com.sujal.mesh_pay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/1")
    @ResponseBody
    private String hello(){
        return "Hello";
    }

    @GetMapping("/2")
    private String hello2(){
        return "hello";
    }
}
