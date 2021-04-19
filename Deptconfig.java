package com.core.springsannotations.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class Deptconfig {
	@Bean
	
	public Departmentbean getdept() {
		
		Departmentbean b4= new Departmentbean();
		b4.setDid(1000);
		b4.setDname("Developer");
		return b4;
		
	}
	@Bean
	
	public Departmentbean getdepttest() {
		Departmentbean b5= new Departmentbean();
		b5.setDid(1001);
		b5.setDname("Testing");
		return b5;
	}
	@Bean
	
	public Departmentbean getdeptname() {
		Departmentbean b6 = new Departmentbean();
		b6.setDid(1002);
		b6.setDname("HR");
		return b6;
	}
	@Bean(name="Analyst")
	@Primary
	public Departmentbean getdepartment() {
		Departmentbean b7 = new Departmentbean();
		b7.setDid(1003);
		b7.setDname("Analyst");
		return b7;
	}

}
