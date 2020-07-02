package com.example.demo.bean.difenation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {
    @Override
    public void user() {
        System.out.println("抓鱼的");
    }
}
