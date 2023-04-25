package com.qy.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class QuickController {
    @RequestMapping("/quick")
    public String quick(Model model){
        //调用service获取业务数据
        model.addAttribute("title","web开发");
        model.addAttribute("time", LocalDateTime.now());

        //指定视图，显示数据
        return "quick";
    }

}
