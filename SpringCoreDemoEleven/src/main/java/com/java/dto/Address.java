package com.java.dto;

import lombok.Data;

@Data
public class Address {

	int hNo;
	String city, state;
	int pincode;
//If constructor is private? Spring can still create the object bcoz it uses reflection
	private Address(){
		System.out.println("Constructor for address called");
	}
	
}
