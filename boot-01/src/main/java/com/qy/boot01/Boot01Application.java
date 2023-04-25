package com.qy.boot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Boot01Application {
    @Bean
    public Date myDate(){
        return new Date();
    }

    public static void main(String[] args) {

        SpringApplication.run(Boot01Application.class, args);
    }

}
