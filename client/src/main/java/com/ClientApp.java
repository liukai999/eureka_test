package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class);
    }
    @GetMapping("/hello")
    public HashMap<String, Object> helle(){
        HashMap<String, Object> backMap = new HashMap<>();
        backMap.put("username","xiaoliu");
        backMap.put("age", 19);
        backMap.put("sex","男");
        backMap.put("port",10011);

        return backMap;
    }
}
