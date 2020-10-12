package com.sujata.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Sonu")
public class Juggler implements Performer {

	@Value("7")
	private int balls;
	
	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
