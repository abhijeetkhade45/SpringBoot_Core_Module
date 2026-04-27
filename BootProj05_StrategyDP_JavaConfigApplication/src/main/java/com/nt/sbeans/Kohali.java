package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("kohali")
public class Kohali implements PLayer{

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		System.out.println("Kohali is Batting");
		
	}

	@Override
	public void balling() {
		// TODO Auto-generated method stub
		System.out.println("Kohali is Balling");
	}
	
}
