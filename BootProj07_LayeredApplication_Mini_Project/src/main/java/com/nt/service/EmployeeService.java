package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeService {
	public List<Employee> fetch_AllEmp_By_Desgn(String desgn1,String desgn2,String desgn3) throws Exception;
}
