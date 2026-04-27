package com.nt.sbeans;

import org.springframework.stereotype.Component;


public class Petrole implements IEngine {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric Engine Start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric Engine Stop");
	}
}
