package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Demo;

@SpringBootApplication
public class BootProj13ValueAndConfigPropertyResAnnotationApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx=	SpringApplication.run(BootProj13ValueAndConfigPropertyResAnnotationApplication.class, args);
	 Demo demo=ctx.getBean("demo",Demo.class);
	 System.out.println(demo);
	}

}
