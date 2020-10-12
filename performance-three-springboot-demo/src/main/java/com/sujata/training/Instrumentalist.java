package com.sujata.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		instrument.play();

	}

}
