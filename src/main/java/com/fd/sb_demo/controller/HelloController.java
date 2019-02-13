package com.fd.sb_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cdq
 * @create :2019-01-24 14:09
 */
//@RestController用于标注控制层组件
//@RequestMapping：提供路由信息，负责URL到Controller中的具体函数的映射。

@RestController
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "helloWorld";
    }
}
