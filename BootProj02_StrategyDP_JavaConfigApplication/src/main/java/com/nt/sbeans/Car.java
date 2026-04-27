package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("car")
public class Car {
	@Qualifier("sc")
	@Autowired
	private Vehical vehical;
	public void journey() {
		vehical.start();
		vehical.stop();
	}	
}
