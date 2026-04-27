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
	
	private static final  String INSERT_EMP="INSERT INTO emp(ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?)";
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

	        ps.setNull(3, java.sql.Types.INTEGER);
	        ps.setNull(4, java.sql.Types.DATE);   

	        ps.setDouble(5, emp.getSalary());

	        ps.setNull(6, java.sql.Types.DOUBLE);  

	        ps.setInt(7, emp.getDeptno());
	        

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
