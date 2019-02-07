package com.java.dto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//Get hold of spring container in other classes
public class P1 implements ApplicationContextAware{
	ApplicationContext context;
	Employee e1;

	{
		//employee object from spring container?
		e1=context.getBean(Employee.class);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}
}
