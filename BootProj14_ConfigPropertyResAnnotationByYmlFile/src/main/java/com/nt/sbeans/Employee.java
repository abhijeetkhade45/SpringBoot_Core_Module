package com.nt.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "employee.info")
public class Employee {
	String empName;
	int deptNo;
	int empAge;
	double empSlary;
	int[] empDutyDay;
	List<Integer> empAttendanceList;
	Map<String,Object> empPersonalInfo;
	EmployeeFamily empFamily;
	
	
	
}
