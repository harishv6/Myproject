package com.core.springsannotations.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.core.springsannotations.config.Employeeconfig;

public class Employeetest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Employeeconfig.class);
//		 Employeebean bean=  context.getBean(Employeebean.class);
//		 System.out.println(bean);
		 
//		 bean.setId(10);
//		 bean.setName("dhoni");
//		 
//		 System.out.println(bean);
		 
		 Employeebean b3= context.getBean("three", Employeebean.class);
		 Employeebean b31= context.getBean("two", Employeebean.class);
		 Employeebean b32= context.getBean("one", Employeebean.class);
		 
		 System.out.println(b31);
		 
		 
		
		
		
	}

}
