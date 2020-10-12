package com.sujata.training;

import org.springframework.stereotype.Component;

public class GoodMorning implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Morning "+name);

	}

}
