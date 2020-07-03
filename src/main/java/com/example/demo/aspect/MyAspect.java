package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
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
    @Around("pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
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
