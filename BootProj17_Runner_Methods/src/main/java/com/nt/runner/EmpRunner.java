package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeOptionsController;
import com.nt.model.Employee;
@Component
public class EmpRunner implements CommandLineRunner{
	@Autowired
	EmployeeOptionsController empOptionController;
	
	@Override
	public void run(String... args) throws Exception {
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
