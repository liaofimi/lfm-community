package com.liao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liao.mapper")
public class FuMingBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(FuMingBlogApplication.class,args);
    }
}
