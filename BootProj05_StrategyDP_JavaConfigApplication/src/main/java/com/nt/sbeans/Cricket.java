package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("cricket")
public class Cricket {
	@Autowired
	@Qualifier("Name")
	PLayer player;
	public void playing() {
		player.balling();
		player.batting();
	}
}
