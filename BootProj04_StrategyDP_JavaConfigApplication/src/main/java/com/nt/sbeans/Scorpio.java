package com.nt.sbeans;

import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Component("sc")
public class Scorpio implements Vehical{
	public void start() {
		System.out.println("Scorpio Getting Started");
	}
	public void stop() {
		System.out.println("Scorpio Getting Stopped");
	}
}
