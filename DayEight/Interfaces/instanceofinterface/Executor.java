//Program to demonstrate interface instance using factory method
package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Executor {
	public static void main(String args[]) {
		
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}
}
