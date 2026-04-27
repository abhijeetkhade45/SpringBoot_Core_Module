package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	@Bean(name="ld")
	public LocalDate createDate() {
	    return LocalDate.now();
	}
	public static void main(String[] args) {
		
		ApplicationContext ctx =
			    SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		SeasonFinder sf=ctx.getBean("sf",SeasonFinder.class);
		System.out.println(sf.getSeason());
	}

}
