package com.java.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//singleton scope is default
//prototype
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
//If a field is not part of the constructor, but we want to make it mandatory
	//@Required annnotation. This is used on the setter method only.
	int id;
	String name;
	List<String> projects;
	float salary;
	String[] references;
	
	public Employee(int id, String name, float salary) {
		System.out.println("Constructor called!");
		this.id= id;
		this.name=name;
		this.salary= salary;
	}
	//RequiredAnnotationBeanPostProcessor: It checks that u have provided values for fields whose setter
	//are annotated with @Required annotation
	@Required
	public void setReferences(String[] references) {
		this.references= references;
	}
}
