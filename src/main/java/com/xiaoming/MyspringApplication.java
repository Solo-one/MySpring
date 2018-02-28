package com.xiaoming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoming.dao")
public class MyspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringApplication.class, args);
    }
}
