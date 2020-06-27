package com.en;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ProductApplication
 * @Description 启动类
 * @Author liuxiaobai
 * @Date 2020年6月25日11:21:02
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.en.mapper")
@EnableEurekaClient
public class ProductApplicationThird {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplicationThird.class,args);
    }
}
