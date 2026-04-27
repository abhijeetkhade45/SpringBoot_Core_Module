package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Vehical;

@SpringBootApplication
public class BootProj06StrategyDpJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj06StrategyDpJavaConfigApplication.class, args);
		Vehical vehical=ctx.getBean("vehical",Vehical.class);
		vehical.Journey();
	}

}
