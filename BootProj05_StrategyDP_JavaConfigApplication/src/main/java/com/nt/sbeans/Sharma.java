package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sharma")
public class Sharma  implements PLayer{
	public void batting() {
		// TODO Auto-generated method stub
		System.out.println("Sharma is Batting");
		
	}

	@Override
	public void balling() {
		// TODO Auto-generated method stub
		System.out.println("Shamrma is Balling");
	}
}
