package com.example.demo.bean.difenation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ChineseMan implements Person, BeanNameAware, DisposableBean, BeanFactoryAware, ApplicationContextAware
, InitializingBean {

     private Animal animal;

    @Override
    public void service() {
        this.animal.user();

    }

    @Override
    @Autowired
    @Qualifier(value = "dog")
    public void setAnimal(Animal animal) {
        System.out.println("lazy 加载！！！");
        this.animal =animal;


    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanFactoryAware的setBeanFactory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanNameAware的setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]调用DisposableBean的destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]调用InitializingBean的afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]调用ApplicationContextAware的setApplicationContext");
    }

    @PostConstruct
    public void init() {
        System.out.println("["+this.getClass().getSimpleName()+"]调用@PostConstruct的定义的自定义的初始化方法");

    }
    @PreDestroy
    public void destroy1(){
        System.out.println("["+this.getClass().getSimpleName()+"]调用@PreDestroy的定义的自定义的销毁方法");


    }
}
