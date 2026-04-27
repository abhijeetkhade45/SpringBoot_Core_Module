package com.nt.factory;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Electric;
import com.nt.sbeans.IEngine;
import com.nt.sbeans.Petrole;
@Component
public class EngineFactory implements FactoryBean<IEngine> {
	@Value("${engine.id}")
	String engineId;

	@Override
	public @Nullable IEngine getObject() throws Exception {
		// TODO Auto-generated method stub
		if(engineId.equals("petrole")) {
			return new Petrole();
		}
		else if(engineId.equals("electric")) {
			return new Electric();
		}
		else {
			throw new  IllegalAccessException("Invalid EngineId");
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IEngine.class;
	}
	public boolean isSingleton() {
		return true;
	}

}
