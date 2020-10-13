package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.persistence")
@EntityScan(basePackages="com.sujata.bean")
public class SpringbootRestSecondDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestSecondDemoApplication.class, args);
	}

	
}
