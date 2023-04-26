package com.example.aienuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.aienuserservice.model")
public class AienUserservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(AienUserservice1Application.class, args);
	}

}
