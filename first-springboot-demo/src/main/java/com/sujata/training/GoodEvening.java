package com.sujata.training;

import org.springframework.stereotype.Component;

@Component("ge")
public class GoodEvening implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Evevning "+name);

	}

}
