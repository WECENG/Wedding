package com.qianfeng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qianfeng")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootApp{
    public static void main(String[] args){
        SpringApplication.run(SpringBootApp.class,args);
    }
}
