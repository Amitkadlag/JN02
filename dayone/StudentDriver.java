//Program to demonstrate Driver class for Student Entity
package com.tnsif.dayone;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student(); //default constructor
		s1.rollNo=10;
		s1.name="Pooja";
		s1.m1=56;
		s1.m2=78;
		s1.m3=77;
		s1.show();
		System.out.println(s1);
		Student s2=new Student(101, "Aniket", 60, 70, 80); //parameterized constructor
		s2.show();
				
	}

}
