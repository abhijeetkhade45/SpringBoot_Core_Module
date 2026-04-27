package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Car;

@SpringBootApplication
public class BootProj02StrategyDpJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02StrategyDpJavaConfigApplication.class, args);
		Car car=ctx.getBean("car",Car.class);
		car.journey();
	}

}
