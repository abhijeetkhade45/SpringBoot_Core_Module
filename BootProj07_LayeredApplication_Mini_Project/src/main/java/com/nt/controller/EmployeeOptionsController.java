package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;
@Component("empOptCtr")
public class EmployeeOptionsController {
	@Autowired
	private EmployeeService employeeService;
	public List<Employee> showAllEmpByDesgn(String d1,String d2,String d3) throws Exception{
		
		return employeeService.fetch_AllEmp_By_Desgn(d1, d2, d3);
	}
}
