package com.core.springsannotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employeebean implements Serializable {
	
	private int   id;
	
	private String name;
	
	public Employeebean() {
		
	}
	
	@Autowired(required=false)
	@Qualifier("Analyst")
	private Departmentbean d;
	
	

}
