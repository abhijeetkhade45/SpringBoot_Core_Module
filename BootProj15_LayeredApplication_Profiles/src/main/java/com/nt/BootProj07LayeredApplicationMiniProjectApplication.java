package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.EmployeeOptionsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj07LayeredApplicationMiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07LayeredApplicationMiniProjectApplication.class, args);
		EmployeeOptionsController empOptionController=ctx.getBean("empOptCtr",EmployeeOptionsController.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Ename : ");
		String ename=sc.nextLine();
		System.out.println("Enter a job : ");
		String job=sc.nextLine();
		System.out.println("Enter a  salary: ");
		double salary=sc.nextDouble();
		System.out.println("Enter a DeptNo : ");
		int deptNo=sc.nextInt();
		Employee emp=new Employee();
		emp.setEname(ename);
		emp.setDeptno(deptNo);
		emp.setSalary(salary);
		emp.setJob(job);
		try {
			String  message=empOptionController.insertemp(emp);
			System.out.println(message);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
