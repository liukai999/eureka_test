package com.xiaoliu.feign.controller;

import com.xiaoliu.feign.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {
    @Autowired
    HelloClient helloClient;
    @GetMapping("/hello")
    public HashMap<String, Object> hello(){
       return helloClient.hello();
    }
}
