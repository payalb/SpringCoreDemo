package com.java;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowiring
public class Client {

	public static void main(String[] args) {
		// start ur spring container
		ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
		
		factory.registerShutdownHook(); //Tell the spring container to shutdown by destroying all bean objects.
	}
}
//jdbc: 