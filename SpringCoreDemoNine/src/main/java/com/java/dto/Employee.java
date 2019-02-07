package com.java.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//init(). destroy()
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
	Address address;
	public Employee(int id, String name, float salary, Address address) {
		System.out.println("Constructor for employee called!");
		this.id= id;
		this.name=name;
		this.salary= salary;
		this.address= address;
	}
	public void setReferences(String[] references) {
		this.references= references;
	}
	
	public void init() {
		System.out.println("Employee init called");
	}
}
