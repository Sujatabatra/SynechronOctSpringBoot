package com.sujata.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;
import org.springframework.stereotype.Component;

@Component("Suresh")
public class Instrumentalist implements Performer {

	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		instrument.play();

	}

}
