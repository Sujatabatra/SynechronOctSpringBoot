package com.sujata.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {
	
	@RequestMapping(path="/myresource",produces="text/plain")
	public String getIt(){
		return "<h1>Got It!!</h1>";
	}
	
	@RequestMapping(path="/first",produces="text/html")
	public String getItAgain(){
		return "<h1>Got It!!</h1>";
	}

}
