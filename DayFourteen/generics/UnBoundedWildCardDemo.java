package com.tnsif.dayfourteen.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {
	public static void main(String[] args) {
		Integer [] a= {10,4,6,3,7};
		List<Integer> intList=Arrays.asList(a);
		
		Float[] b= {10f,20f,30f,40f,50f};
		List<Float> floatList=Arrays.asList(b);
		
		String s[]= {"C","C++", "Java", ",NET", "Python"};
		List<String> courseList=Arrays.asList(s);
		
		UnBoundedWildCard obj=new UnBoundedWildCard();
		obj.display(intList);
		
		UnBoundedWildCard obj1=new UnBoundedWildCard();
		obj1.display(floatList);
		
		UnBoundedWildCard obj2=new UnBoundedWildCard();
		obj2.display(courseList);

		Student st[]=new Student[]{new Student(1,"Neha",56f) ,new Student(2,"Pooja",78f),new Student(3,"Ankita",77f)};
		List<Student> studentList=Arrays.asList(st);
		
		UnBoundedWildCard obj3=new UnBoundedWildCard();
		
		obj3.display(studentList);
		
	}
}
