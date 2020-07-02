package com.example.demo.bean.difenation;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public void user() {
        System.out.println("铲屎官");
    }
}
