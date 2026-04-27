package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
@Component("car")
public class Car {
	@Autowired
	@Qualifier("motor")
	private Vehical vehical;
	public void journey() {
		vehical.start();
		vehical.stop();
	}	
}
