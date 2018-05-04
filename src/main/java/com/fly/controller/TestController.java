package com.fly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description : 单元测试DEMO
 * @Author : liu.fly 2018/5/3
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "ok";
    }
}
