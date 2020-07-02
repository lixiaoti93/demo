package com.example.demo.invoke.intercept;

import com.example.demo.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {
    //事前方法
    public boolean before();

    //事后方法
    public void after();

    /**
     * 取代原有事件方法
     * @param invocation 回调参数，可以通过她的proceed方法，回调原有事件
     * @return 原有事件返回方法
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object around(Invocation invocation) throws InvocationTargetException,IllegalAccessException;
    //事后异常方法的，当事件发生异常后执行
    public void afterThrowing();
    //是否返回方法，当事件没有发生异常执行
    public void afterReturning();
    //是否使用around方法取代原有方法
    boolean userAround();
}
