package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* com.example.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after.......");
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
