package com.tnsif.dayten;

public class PersonDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Ankit");
		try {
			p.setAge(23);
		
		System.out.println(p);
		
		Person p1 = new Person("Rudra", 4);
		} catch (InvalidAgeException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
