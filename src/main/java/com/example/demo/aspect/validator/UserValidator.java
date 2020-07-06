package com.example.demo.aspect.validator;

import com.example.demo.bean.User;

public interface UserValidator {
//检测用户信息是否为空
    public boolean validate(User user);
}
