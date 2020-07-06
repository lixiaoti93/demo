package com.example.demo.controller;

import com.example.demo.aspect.validator.UserValidator;
import com.example.demo.bean.User;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入服务信息
    @Autowired
    private UserService userService;

    //定义请求
    @RequestMapping("/print")
    @ResponseBody
    public User printUser(String name, int age, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setAge(age);
        userService.printUser(user);//若user=null，则执行afterthrowing方法
        return user;//加入断点

    }

    @RequestMapping("/printUser")
    @ResponseBody
    public User validateAndPrint(String name, int age, String phone) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setPhone(phone);
        UserValidator userValidator =(UserValidator)userService;
        if(userValidator.validate(user)){
            userService.printUser(user);
        }
        return user;

    }

    @RequestMapping("/manyAspects")
    @ResponseBody
    public String manyAspects() {
        userService.manyAspects();
        return "manyAspects";
    }


}
