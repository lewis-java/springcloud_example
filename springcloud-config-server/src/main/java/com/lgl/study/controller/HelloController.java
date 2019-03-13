package com.lgl.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/test")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
