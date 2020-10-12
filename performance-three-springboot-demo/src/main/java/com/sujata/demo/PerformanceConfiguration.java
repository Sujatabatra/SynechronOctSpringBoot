package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sujata.training.Guitar;
import com.sujata.training.Instrumentalist;
import com.sujata.training.Singer;

@Configuration
@Profile("Production")
public class PerformanceConfiguration {
	
	@Bean(name="Monu")
	public Singer singer(){
		Singer singer=new Singer();
		singer.setSong("LALALALA");
		return singer;
	}
	
	@Bean
	public Guitar guitar(){
		return new Guitar();
	}
	
	@Bean(name="Suresh")
	public Instrumentalist instrumentalist(){
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(guitar());
		return instrumentalist;
	}

}
