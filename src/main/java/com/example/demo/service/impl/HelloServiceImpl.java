package com.example.demo.service.impl;

import com.example.demo.service.HeloService;

public class HelloServiceImpl implements HeloService {
    @Override
    public void sayHello(String name) {
        if(null==name ||"".equals(name.trim())){
            System.out.println("params 参数为空！！");
        }
        System.out.println("Hello"+name);
    }
}
