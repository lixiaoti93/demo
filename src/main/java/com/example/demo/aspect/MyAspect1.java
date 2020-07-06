package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class MyAspect1 {
    @Pointcut("execution(* com.example.demo.service.impl.UserServiceImpl.manyAspects(..))")
    public void manyAspects() {

    }

    @Before("manyAspects()")
    public void before() {
        System.out.println("MyAspect1 before......");
    }


    @After("manyAspects()")
    public void after() {
        System.out.println("MyAspect1 after.......");
    }

    @Around("manyAspects()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyAspect1 around before ...");
        //回调目标函数的回调方法
        proceedingJoinPoint.proceed();

        System.out.println("MyAspect1 around after ...");

    }

    @AfterReturning("manyAspects()")
    public void afterReturning() {
        System.out.println("MyAspect1 afterReturning.......");
    }

    @AfterThrowing("manyAspects()")
    public void afterThrowing() {
        System.out.println("MyAspect1 afterThrowing.......");
    }
}
