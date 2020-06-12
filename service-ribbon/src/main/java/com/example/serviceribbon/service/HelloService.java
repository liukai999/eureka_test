package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service

public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public HashMap<String,Object> hiService() {
        return restTemplate.getForObject("http://xiaoliu/hello",HashMap.class);
    }
    public HashMap<String,Object> hiError(){
        HashMap <String,Object> backMap = new HashMap();
        backMap.put("state",-1);
        return backMap;
    }

}
