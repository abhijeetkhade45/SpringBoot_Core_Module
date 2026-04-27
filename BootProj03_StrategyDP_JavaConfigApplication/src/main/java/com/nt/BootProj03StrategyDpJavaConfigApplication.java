package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Car;

@SpringBootApplication
public class BootProj03StrategyDpJavaConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(BootProj03StrategyDpJavaConfigApplication.class, args);
		Car car=ctx.getBean("car",Car.class);
		car.journey();
	}

}
