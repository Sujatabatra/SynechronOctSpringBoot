package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.presentation.ItemUI;

@SpringBootApplication(scanBasePackages="com.sujata")
public class FirstSpringbootjdbcDemoApplication implements CommandLineRunner {

	@Autowired
	ItemUI itemUi;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootjdbcDemoApplication.class, args);
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
