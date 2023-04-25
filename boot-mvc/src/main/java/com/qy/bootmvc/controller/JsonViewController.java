package com.qy.bootmvc.controller;

import com.qy.bootmvc.pojo.User;
import jakarta.servlet.http.HttpServletResponse;
import lombok.var;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

@RestController
public class JsonViewController {
    @RequestMapping("/p1")
    public String p1(User user) {
        return "接收对象参数：" + user.toString();
    }

    @PostMapping("/p2")
    public String p2(@RequestBody User user) {
        return "p2 json:" + user.toString();
    }

    @PostMapping("/p3")
    public String p3(Reader reader) {
        StringBuffer content = new StringBuffer("");
        try (BufferedReader bin = new BufferedReader(reader)){
            var line = "";
            while ((line = bin.readLine())!=null){
                content.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "p3 reader=" + content.toString();

    }
}
