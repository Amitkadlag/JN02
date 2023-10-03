//Program to define Person class
package com.tnsif.daysix.multilevelinheritance;

public class Person {
	private String name;
	private long contactNo;
	
	//Constructor
	public Person() {
		System.out.println("Person class constructor");
	}
	public Person(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}
	
	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	
	
}
