package com.example.demo.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.example.demo.*", excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class SnowConfig {
    //
//    @Bean(name = "user")
//    public User initUser() {
//        User user = new User();
//        user.setAge(18);
//        user.setName("我好帅");
//        user.setPhone("15123991021");
//        return user;
//
//    }
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        Properties properties = new Properties();
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://localhost:3306//mysqltest");
        properties.setProperty("username","root");
        properties.setProperty("password","wq19930311");
        DataSource dataSource =null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;

    }

}
