package com.example.demo;

import com.example.demo.aspect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.demo.*"})
public class DemoApplication {
    //定义切面
    @Bean(name = "myAspect")
    public MyAspect initMyAspect(){
        return new MyAspect();
    }
//启动切面
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
