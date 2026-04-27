package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	@Qualifier("dao")
	private EmployeeDAO employeeDao;

	@Override
	public String insertemp(Employee emp)  throws Exception {
		// TODO Auto-generated method stub
		int msg=employeeDao.insertemp(emp);
		if(msg==0) {
			return "Emplyee Failed to Registered >>";
		}
		else {
			return "Employee Sucessfully Registred <<";
		}
	
	}

}
