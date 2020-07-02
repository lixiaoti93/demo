package com.example.demo.invoke;

import com.example.demo.invoke.intercept.Interceptor;

import java.lang.reflect.InvocationTargetException;

public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before ......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after ......");

    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before ......");
        Object object = invocation.proceed();
        System.out.println("around  after.....");
        return null;
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing .....");

    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning ......");

    }

    @Override
    public boolean userAround() {
        return true;
    }
}
