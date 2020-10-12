package com.sujata.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/first")
	public ModelAndView firstController(){
		return new ModelAndView("first", "message", "Welcome to the world of Spring Boot Web MVC");
	}
}
