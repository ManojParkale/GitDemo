package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGithubApplication.class, args);
		System.out.println("hello github");
	}
		
}
