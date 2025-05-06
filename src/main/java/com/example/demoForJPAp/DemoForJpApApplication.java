package com.example.demoForJPAp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.example.controller")
@EnableJpaRepositories(basePackages="com.example.Repo")
@EntityScan(basePackages="com.example.Entity")

public class DemoForJpApApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(DemoForJpApApplication.class, args);
	}

}
