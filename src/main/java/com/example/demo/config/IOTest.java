package com.example.demo.config;


import com.example.demo.bean.User;
import com.example.demo.bean.difenation.ChineseMan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class IOTest {
    private static Logger logger = Logger.getLogger("TOTest");

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SnowConfig.class);
//        ChineseMan chineseMan =applicationContext.getBean(ChineseMan.class);
//       chineseMan.service();
        System.out.println(applicationContext.getClass());
        ((AnnotationConfigApplicationContext) applicationContext).close();


    }

}
