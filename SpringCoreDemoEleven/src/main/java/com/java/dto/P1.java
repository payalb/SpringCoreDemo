package com.java.dto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class P1 implements ApplicationContextAware{
	ApplicationContext context;
	Employee e1;

	{
		//employee object from spring container?
		System.out.println("p1 created");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}
	
	public void m1() {
		e1=context.getBean(Employee.class);
		System.out.println(e1);
	}
}
