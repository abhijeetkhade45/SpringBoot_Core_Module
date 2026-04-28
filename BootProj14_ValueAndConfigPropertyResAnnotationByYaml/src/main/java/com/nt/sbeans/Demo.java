package com.nt.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "student.info")
public class Demo {
	String name;
	int rollNum;
	int age;
	String address;
	String arr[];
	Map<String,Object> student2;
	Card card;
	@Value("${bank.balance}")
	double bankbalance;
	
	@Value("${info.list}")
	String arr2[];
	List<String> names;
	
}
