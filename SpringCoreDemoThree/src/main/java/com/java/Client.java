package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.java.dto.Employee;

public class Client {

	
	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		//singleton scope
		Employee e1=factory.getBean("e1", Employee.class);
		Employee e2=factory.getBean("e1", Employee.class);
		System.out.println(e1== e2);
		//prototype scope
		Employee e3=factory.getBean("e2", Employee.class);
		Employee e4=factory.getBean("e2", Employee.class);
		System.out.println(e3== e4);
	}
}
