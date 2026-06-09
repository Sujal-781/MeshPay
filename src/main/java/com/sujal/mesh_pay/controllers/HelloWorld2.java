package com.sujal.mesh_pay.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HelloWorld2 {

    @GetMapping
    private String hi(){
        return "Hi";
    }
}
