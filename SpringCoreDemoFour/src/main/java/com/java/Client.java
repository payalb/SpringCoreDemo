package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.java.dto.Employee;

public class Client {

	
	public static void main(String[] args) {
		//BeanFactory does not support beanpostprocessors. It does lazy loading of beans
	//	BeanFactory factory= new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		ApplicationContext factory= new ClassPathXmlApplicationContext("spring-config.xml");
		//Eager loading of beans with singleton scope
		//singleton scope
		Employee e1=factory.getBean("e1", Employee.class);
		Employee e2=factory.getBean("e1", Employee.class);
		System.out.println(e1== e2);
		//prototype scope: It will only create the object when u do geBean
		Employee e3=factory.getBean("e2", Employee.class);
		Employee e4=factory.getBean("e2", Employee.class);
		System.out.println(e3== e4);
		
		BeanFactory factory1= new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		
	}
}
