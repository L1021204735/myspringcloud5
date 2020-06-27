package com.en.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationThird {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationThird.class,args);
    }
}
