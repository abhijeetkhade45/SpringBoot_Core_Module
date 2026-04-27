package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
@Named("car")
public class Car {
	@Resource(name="sc")
	private Vehical vehical;
	public void journey() {
		vehical.start();
		vehical.stop();
	}	
}
