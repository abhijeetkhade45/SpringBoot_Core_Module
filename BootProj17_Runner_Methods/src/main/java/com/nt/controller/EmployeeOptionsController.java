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
	public String insertemp(Employee emp) throws Exception{
		
		return employeeService.insertemp(emp);
	}
}
