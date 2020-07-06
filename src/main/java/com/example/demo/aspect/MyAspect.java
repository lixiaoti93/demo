package com.example.demo.aspect;

import com.example.demo.aspect.validator.UserValidator;
import com.example.demo.aspect.validator.impl.UserValidatorImpl;
import com.example.demo.bean.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    /**
     * @DeclareParents 引入新的类来加强服务
     * value 指向要增强的功能的目标对象，defaultImpl 引入增强功能的类
     */
    @DeclareParents(value = "com.example.demo.service.impl.UserServiceImpl+", defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.example.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before......");
    }

    @Before("pointCut()&& args(user)")
    public void beforeParam(JoinPoint joinPoint, User user) {
        Object[] args =joinPoint.getArgs();
        System.out.println("before .....");

    }

    @After("pointCut()")
    public void after() {
        System.out.println("after.......");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before ...");
        //回调目标函数的回调方法
        proceedingJoinPoint.proceed();

        System.out.println("around after ...");

    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning.......");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing.......");
    }

}
