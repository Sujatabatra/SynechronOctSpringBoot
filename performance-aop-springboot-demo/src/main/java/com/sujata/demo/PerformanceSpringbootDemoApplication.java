package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sujata.training.Guitar;
import com.sujata.training.Instrumentalist;
import com.sujata.training.Performer;
import com.sujata.training.Singer;

@SpringBootApplication(scanBasePackages="com.sujata.training")
@EnableAspectJAutoProxy
public class PerformanceSpringbootDemoApplication /*implements CommandLineRunner*/ {

	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(PerformanceSpringbootDemoApplication.class, args);
		Performer p1=(Performer)context.getBean("Suresh");
		p1.perform();
		System.out.println("===============");
		Performer p2=(Performer)context.getBean("Monu");
		p2.perform();
		
	}

	

}
