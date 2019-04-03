package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.controller","com.example.service.impl"})
@EnableEurekaClient
@EnableFeignClients("com.example.service")
public class ServiceOrderFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOrderFeignApplication.class, args);
	}

}
