//Program to define Student Entity
package com.tnsif.dayone;

//class Student
public class Student {
	int rollNo;
	String name;
	int m1, m2, m3;
	float per;
	//Default Constructor
	Student(){
		System.out.println("Default Constructor");
	}
	//Parameterized Constructor
	Student(int rollNo, String name, int m1, int m2, int m3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	//show method 
	void show()
	{
		per=(m1+m2+m3)/3.0f;
		System.out.println("-------------Student Information---------");
		System.out.println("RollNo "+rollNo+"\tName "+name+"\tM1 "+m1+"\tM2 "+m2+"\tM3 "+m3+"\tPercentage "+per);
	}
}
