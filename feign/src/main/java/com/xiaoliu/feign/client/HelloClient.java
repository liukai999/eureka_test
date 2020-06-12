package com.xiaoliu.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@FeignClient(value = "xiaoliu")
public interface HelloClient {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public HashMap<String, Object> hello();
}
