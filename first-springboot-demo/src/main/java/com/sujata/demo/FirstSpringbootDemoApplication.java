package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.training.GoodMorning;
import com.sujata.training.Greet;

//@Configuration+@ComponentScan(Default as current package)+@EnableAutoConfiguration : Enable auto-configuration of the Spring Application Context
@SpringBootApplication(scanBasePackages="com.sujata.training")
public class FirstSpringbootDemoApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("ge")
	Greet greet;
	
	public static void main(String[] args) {
		/*ApplicationContext iocContainer=*/SpringApplication.run(FirstSpringbootDemoApplication.class, args);
//		Greet g1=(Greet)iocContainer.getBean("gm");
//		g1.wish("Sujata");
		
	}

	@Override
	public void run(String... args) throws Exception {
		greet.wish("Sujata");
		
	}
	
	@Bean(name="gm")
	public GoodMorning gm(){
		return new GoodMorning();
	}

}
