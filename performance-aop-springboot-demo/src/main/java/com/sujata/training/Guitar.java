package com.sujata.training;

import org.springframework.stereotype.Component;


@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("TIN TIN TIN ");

	}

}
