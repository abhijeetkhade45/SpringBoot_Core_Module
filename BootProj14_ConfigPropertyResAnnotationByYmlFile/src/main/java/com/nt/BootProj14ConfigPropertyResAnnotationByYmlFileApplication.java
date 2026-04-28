package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj14ConfigPropertyResAnnotationByYmlFileApplication {

	public static void main(String[] args) {
ApplicationContext	ctx	=SpringApplication.run(BootProj14ConfigPropertyResAnnotationByYmlFileApplication.class, args);
      Employee emp=ctx.getBean("employee",Employee.class);
      System.out.println(emp);

	}

}
