package com.nt.factory;

import javax.sql.DataSource;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAO2;
import com.nt.dao.EmployeeDAOImpl;
@Component("daofactory")
public class DAOFactory implements FactoryBean<EmployeeDAO> {
	@Autowired
	DataSource ds;
	@Value("${dao.id}")
	String dbType;
	@Override
	public @Nullable EmployeeDAO getObject() throws Exception {
		if(dbType.equals("oracledao")) {
			return new EmployeeDAOImpl(ds);
		}
		else if(dbType.equals("mysqldao")) {
			return new EmployeeDAO2(ds);
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return EmployeeDAO.class;
	}
	@Override
	public boolean isSingleton() {
		return true;
	}

}
