package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class MyAspect3 {
    @Pointcut("execution(* com.example.demo.service.impl.UserServiceImpl.manyAspects(..))")
    public void manyAspects() {

    }

    @Before("manyAspects()")
    public void before() {
        System.out.println("MyAspect3 before......");
    }


    @After("manyAspects()")
    public void after() {
        System.out.println("MyAspect3 after.......");
    }

    @Around("manyAspects()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyAspect3 around before ...");
        //回调目标函数的回调方法
        proceedingJoinPoint.proceed();

        System.out.println("MyAspect3 around after ...");

    }

    @AfterReturning("manyAspects()")
    public void afterReturning() {
        System.out.println("MyAspect3 afterReturning.......");
    }

    @AfterThrowing("manyAspects()")
    public void afterThrowing() {
        System.out.println("MyAspect3 afterThrowing.......");
    }

}
