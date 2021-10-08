package com.future.model;

import java.util.Scanner;

public class student implements studentservice {
String name;

	
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public void show()
	{
		System.out.println("Enter Details of Student");
	}

	@Override
	public void get() {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter your name here:");
		String name=sc.next();
	}

	@Override
	public void put() {

		System.out.println("nothing to do right now");
	}

}
