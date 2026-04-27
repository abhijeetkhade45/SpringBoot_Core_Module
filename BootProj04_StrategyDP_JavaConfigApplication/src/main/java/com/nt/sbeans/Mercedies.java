package com.nt.sbeans;

import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Component("mc")
public class Mercedies  implements Vehical {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Mercedies Getting Started");
	}

	public void stop() {
		// TODO Auto-generated method stub\
		System.out.println("Mercedies Getting Stopped");
	}

}
