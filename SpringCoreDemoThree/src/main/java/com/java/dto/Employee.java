package com.java.dto;

import java.util.List;

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

	int id;
	String name;
	List<String> projects;
	float salary;
	String[] references;
	
	public Employee(int id, String name, float salary) {
		this.id= id;
		this.name=name;
		this.salary= salary;
	}
}
