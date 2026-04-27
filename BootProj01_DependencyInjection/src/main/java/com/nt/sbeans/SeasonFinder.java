package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate ldt;
    public String getSeason() {
    	int month=ldt.getMonthValue();
    	if(month>=1 && month<=5) {
    		return "Summer";
    	}
    	else if(month>=7 && month<=9) {
    		return "Winter";
    	}
    	else {
    		return "Monsoon";
    	}
    }
}
