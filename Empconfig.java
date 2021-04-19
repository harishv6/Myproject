package com.core.springsannotations.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import({Deptconfig.class})
@Configuration
public class Empconfig {
	
	
	@Bean
	public Employeebean getEmpbean() {
		
		
		
		Employeebean bean = new Employeebean();
		bean.setId(100);
		bean.setName("basava");
		
		return bean; 
		
	}

}
