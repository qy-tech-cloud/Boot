package com.qy.boot04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com/qy/boot04/mapper")
@SpringBootApplication
public class Boot04Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot04Application.class, args);
    }

}
