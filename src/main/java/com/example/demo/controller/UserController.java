package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入服务信息
    @Autowired
    private UserServiceImpl userService;
//定义请求
    @RequestMapping("/print")
    @ResponseBody
    public User printUser(String name,int age,String phone){
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setAge(age);
        userService.printUser(user);//若user=null，则执行afterthrowing方法
        return user;//加入断点

    }
}
