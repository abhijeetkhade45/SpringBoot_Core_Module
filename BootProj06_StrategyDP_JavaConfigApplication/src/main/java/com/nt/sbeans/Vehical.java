package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("vehical")
public class Vehical {
	@Autowired
	IEngine engine;
	public void Journey() {
		engine.start();
		engine.stop();
	}
}
