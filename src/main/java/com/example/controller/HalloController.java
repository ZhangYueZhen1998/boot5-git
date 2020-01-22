package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {

    @RequestMapping("info")
    public String show(){
        return "哈喽 Stringboot";
    }

    @RequestMapping("shabi")
    public void shazi(){
        System.out.println("我是傻逼");
    }



}
