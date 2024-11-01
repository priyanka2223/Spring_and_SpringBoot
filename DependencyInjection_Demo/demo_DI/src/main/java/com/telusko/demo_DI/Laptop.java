package com.telusko.demo_DI;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Laptop: Compiling Code...");
    }
}
