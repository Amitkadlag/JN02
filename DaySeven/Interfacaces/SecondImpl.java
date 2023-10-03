package com.tnsif.dayseven.interfaces;

public class SecondImpl implements Second{

	@Override
	public void show() {
		System.out.println("In First show() method");
		
	}

	@Override
	public void display() {
		System.out.println("In First display() method");
		
	}

	@Override
	public String greet(String name) {
	
		return "Good Morning "+name;
	}

}
