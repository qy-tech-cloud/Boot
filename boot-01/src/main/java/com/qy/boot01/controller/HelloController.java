package com.qy.boot01.controller;

import com.fasterxml.jackson.databind.DatabindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String Greeting() {
        System.out.println("当前环境："+ environment.getProperty("myapp.memo"));
        return "hello~" + environment.getRequiredProperty("spring.thirddb.port");
    }
}
