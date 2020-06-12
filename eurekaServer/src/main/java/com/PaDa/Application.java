package com.PaDa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//此注解表明他是一个注册中心
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
