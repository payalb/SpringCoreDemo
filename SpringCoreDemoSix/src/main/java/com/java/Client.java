package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.java.dto.Employee;

//Autowiring
public class Client {

	
	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("spring-config.xml");
		Employee e1=factory.getBean("e1", Employee.class);
	System.out.println(e1);
	}
}
