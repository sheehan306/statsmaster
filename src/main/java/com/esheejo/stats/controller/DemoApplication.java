package com.esheejo.stats.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.esheejo"})
@EnableJpaRepositories("com.esheejo.stats.data")
@EntityScan({"com.esheejo.stats.model"})
public class DemoApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
