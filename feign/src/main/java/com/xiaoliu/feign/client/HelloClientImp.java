package com.xiaoliu.feign.client;

import java.util.HashMap;

public class HelloClientImp implements  HelloClient {
    @Override
    public HashMap<String, Object> hello() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("error","调用错误");
        return hashMap;
    }
}
