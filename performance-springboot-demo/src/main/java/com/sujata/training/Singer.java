package com.sujata.training;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Monu")
public class Singer implements Performer,BeanNameAware {

	@Value("LALALALA")
	private String song;
	private String singerName;
	
	@Override
	public void perform() {
		System.out.println(singerName+" is singing "+song);

	}

	@Override
	public void setBeanName(String name) {
		this.singerName=name;
		
	}

}
