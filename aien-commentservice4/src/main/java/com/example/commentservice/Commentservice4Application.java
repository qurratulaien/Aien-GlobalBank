package com.example.commentservice;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages="com.example")
public class Commentservice4Application {

	public static void main(String[] args) {
		SpringApplication.run(Commentservice4Application.class, args);
	}

}
