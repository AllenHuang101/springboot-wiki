package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @GetMapping("/hello")
    //@RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    //@RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(String name) {
        return "Hello World! Post, " + name;
    }
}
