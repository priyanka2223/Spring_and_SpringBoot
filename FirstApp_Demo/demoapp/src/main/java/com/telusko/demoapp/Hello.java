package com.telusko.demoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String welcomeMessage() {
        return "Hello Priyanka";
    }
}
