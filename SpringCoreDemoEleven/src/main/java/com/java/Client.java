package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.java.dto.Employee;
import com.java.dto.P1;

//Autowiring
public class Client {

	public static void main(String[] args) {
		// start ur spring container
		ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee e1 = factory.getBean("e1", Employee.class);
		System.out.println(e1);
		P1 obj=factory.getBean(P1.class);
		obj.m1();
		factory.registerShutdownHook(); //Tell the spring container to shutdown by destroying all bean objects.
	}
}
