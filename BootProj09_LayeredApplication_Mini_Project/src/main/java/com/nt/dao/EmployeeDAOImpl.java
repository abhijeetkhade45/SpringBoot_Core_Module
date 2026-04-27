package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final  String GET_EMP_BY_DESGN_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP  WHERE JOB IN (?,?,?) ORDER BY JOB";
			
	@Autowired
	private DataSource ds;
	
	
	@Override
	public List<Employee> getEmployeeByDesignation(String desgn1, String desgn2, String desgn3) throws Exception {
	    Connection con = null;
	    List<Employee> list = new ArrayList<>();  // ✅ FIX

	    try {
	        con = ds.getConnection();
	        PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESGN_QUERY);

	        ps.setString(1, desgn1.toUpperCase());
	        ps.setString(2, desgn2.toUpperCase());
	        ps.setString(3, desgn3.toUpperCase());

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Employee emp = new Employee();
	            emp.setEno(rs.getInt(1));
	            emp.setEname(rs.getString(2));
	            System.out.println(rs.getString(2));
	            emp.setJob(rs.getString(3));
	            emp.setSalary((double) rs.getFloat(4));
	            emp.setDeptno(rs.getInt(5));

	            list.add(emp);  // ✅ now safe
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        throw e;
	    } finally {
	        if (con != null) con.close();  // ✅ safe close
	    }

	    return list;  // ✅ never null
	}

}
