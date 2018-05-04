package com.fly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : 单元测试DEMO,哈哈
 * @Author : liu.fly 2018/5/3
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "ok";
    }
}
