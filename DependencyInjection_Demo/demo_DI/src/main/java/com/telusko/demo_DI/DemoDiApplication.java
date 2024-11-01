package com.telusko.demo_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoDiApplication.class, args);
		Dev devobj = context.getBean(Dev.class);
		System.out.println("-----------------------------------------------");
		devobj.build();
		System.out.println("-----------------------------------------------");
	}

}
