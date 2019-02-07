package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1 {

}
interface Shape{
	public void draw() ;
	static Shape getInstance() {
		Scanner sc= new Scanner(System.in);
		List<Integer> input= new ArrayList<>();
		while(sc.hasNext()) {
		input.add(Integer.parseInt(sc.nextLine()));
		}
		if(input.size()==1)
		{
			return new Circle(input.get(0));
		}
		else if (input.size()==2) {
			return new Rectangle(input.get(0), input.get(1));
		}
		else {
			throw new RuntimeException("Invalid input");
		}
			
		
	}
}

class Circle implements Shape{
	int radius;
	public Circle(int i) {
		this.radius= i;
	}
	public void draw() {
		System.out.println("drawing circle");
	}
}

class Rectangle implements Shape{
	int length,width;
	public Rectangle(int length, int width) {
		this.length= length;
		this.width= width;
	}
	public void draw() {
		System.out.println("drawing rectangle");
		
	}


	
}