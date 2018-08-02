package com.vv.springbootdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * spring boot 测试应用
 */
@Controller
@EnableAutoConfiguration
public class MyTest {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "MyTest: Hello World!";
    }

}
