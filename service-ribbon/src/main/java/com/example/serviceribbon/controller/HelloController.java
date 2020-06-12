package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public HashMap<String,Object> hello(){
        return helloService.hiService();
    }

}
