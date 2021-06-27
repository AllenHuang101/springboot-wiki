package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    //@RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/hello/post")
    //@RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(String name) {
        return "Hello World! Post, " + name;
    }
}
