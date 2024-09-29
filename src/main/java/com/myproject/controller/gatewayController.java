package com.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gatewayController {

    @GetMapping
    public String hello(){
        return "hello new v1";
    }

    @GetMapping("/test")
    public String helloTest(){
        return "hello new v1.1";
    }
}
