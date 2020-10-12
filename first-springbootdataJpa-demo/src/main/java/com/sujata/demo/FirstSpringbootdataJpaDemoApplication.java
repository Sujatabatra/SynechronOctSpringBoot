package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.ItemUI;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.persistence")
@EntityScan(basePackages="com.sujata.bean")
public class FirstSpringbootdataJpaDemoApplication implements CommandLineRunner {

	@Autowired
	private ItemUI itemUi;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootdataJpaDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		while(true){
			itemUi.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			itemUi.perform(choice);
		}
		
	}
}
