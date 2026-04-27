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
@Repository("mysqldao")
public class EmployeeDAO2 implements EmployeeDAO{
	
	private static final  String INSERT_EMP="INSERT INTO EMP(ENAME,JOB,SAL,DEPTNO) VALUES(?,?,?,?)";
			
	@Autowired
	private DataSource ds;
	
	
	@Override
	public int  insertemp(Employee emp) throws Exception {
	    Connection con = null;
	    int msg=0;
	    // ✅ FIX

	    try {
	        con = ds.getConnection();
	        PreparedStatement ps = con.prepareStatement(INSERT_EMP);

	        
	        ps.setString(1, emp.getEname());
	        ps.setString(2, emp.getJob());
	        ps.setDouble(3,emp.getSalary());
	        ps.setInt(4,emp.getDeptno());
	        

	          msg = ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	        throw e;
	    } finally {
	        if (con != null) con.close();  // ✅ safe close
	    }

	    return msg;  // ✅ never null
	}

}
