package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sujata.training.Guitar;
import com.sujata.training.Instrumentalist;
import com.sujata.training.Singer;
import com.sujata.training.Tabla;

@Configuration
@Profile("development")
public class PerformanceConfig {
	
	@Bean(name="Monu")
	public Singer singer(){
		Singer singer=new Singer();
		singer.setSong("LALALALA!!!!!!!!!");
		return singer;
	}
	
	@Bean
	public Tabla tabla(){
		return new Tabla();
	}
	
	
	@Bean(name="Suresh")
	public Instrumentalist instrumentalist(){
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(tabla());
		return instrumentalist;
	}

}
