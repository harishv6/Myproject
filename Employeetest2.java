package com.core.springsannotations.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.core.springsannotations.config.Employeeconfig;

public class Employeetest2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Empconfig.class);
	Employeebean bean=	context.getBean(Employeebean.class);
	
	System.out.println(bean.getId());
	System.out.println(bean.getName());
	System.out.println(bean.getD().getDid());
	System.out.println(bean.getD().getDname());
		
	}

}
