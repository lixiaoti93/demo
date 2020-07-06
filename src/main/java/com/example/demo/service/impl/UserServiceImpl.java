package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("请检查用户参数是否为空！！！");

        }
        System.out.println("name:" + user.getName());
        System.out.println("age:" + user.getAge());
        System.out.println("phone:" + user.getPhone());
    }

    @Override
    public void manyAspects() {
        System.out.println("测试多个切面");

    }
}
