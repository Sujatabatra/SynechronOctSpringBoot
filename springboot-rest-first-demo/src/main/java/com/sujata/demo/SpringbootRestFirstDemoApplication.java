package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//traversing all the classes in current package and run life cycle of all the classes annonated 
//with either @Component,@Controller,@Repository,@Service,@RestController 
@SpringBootApplication
public class SpringbootRestFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestFirstDemoApplication.class, args);
	}

}
