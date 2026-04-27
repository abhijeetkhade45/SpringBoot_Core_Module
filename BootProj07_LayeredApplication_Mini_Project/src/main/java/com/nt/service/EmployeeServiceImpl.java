package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDao;

	@Override
	public List<Employee> fetch_AllEmp_By_Desgn(String desgn1, String desgn2, String desgn3)  throws Exception {
		// TODO Auto-generated method stub
		List<Employee> emp=employeeDao.getEmployeeByDesignation(desgn1.toUpperCase(), desgn2.toUpperCase(), desgn3.toUpperCase());
		emp.forEach(e -> {
		    double gross = e.getSalary() + (e.getSalary() * 0.5);  // basic + 50%
		    double net = gross - (gross * 0.2);                   // minus 20% tax

		    e.setGrossSalary(gross);
		    e.setNetSalary(net);
		});
		return emp;
	}

}
