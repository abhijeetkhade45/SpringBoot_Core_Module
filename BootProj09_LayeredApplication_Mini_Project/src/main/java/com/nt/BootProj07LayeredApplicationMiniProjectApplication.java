package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeOptionsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj07LayeredApplicationMiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07LayeredApplicationMiniProjectApplication.class, args);
		EmployeeOptionsController empOptionController=ctx.getBean("empOptCtr",EmployeeOptionsController.class);
		try {
			List<Employee> emp=empOptionController.showAllEmpByDesgn("CLERK","MANAGER","SALESMAN");
			System.out.println(emp.size());
			emp.forEach(e->{
				System.out.println(e);
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
