package com.java.dto;

import lombok.Data;

@Data
public class Address {

	int hNo;
	String city, state;
	int pincode;

	Address(){
		System.out.println("Constructor for address called");
	}
	public void m1() {
		System.out.println("init called");
		if (pincode == 0) {
			pincode = 12733;
		}
	}
	
	public void m2() {
		System.out.println("detsroy called");
		city=null;
		state= null;
	}
}
