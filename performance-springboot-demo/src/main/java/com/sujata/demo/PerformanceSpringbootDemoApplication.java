package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.training.Performer;

@SpringBootApplication(scanBasePackages="com.sujata.training")
public class PerformanceSpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Suresh")
	Performer performer;
	
	public static void main(String[] args) {
		SpringApplication.run(PerformanceSpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		performer.perform();
		
	}

}
