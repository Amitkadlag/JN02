package com.tnsif.daythirteen.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("HTML");
		ts.add("C");
		ts.add("Python");
		ts.add("C#.NET");
		ts.add("C++");
		System.out.println(ts);
		
		ts.add("VB.NET");
		ts.add("CSS");
		ts.add("JavaScript");
		System.out.println(ts);	
		 
		TreeSet<Boolean> ts1 =new TreeSet<Boolean>();
		ts1.add(true);
		ts1.add(false);
		ts1.add(true);
		ts1.add(false);
		System.out.println(ts1);
		
		Comparator<Student> comp=(s2,s1)->s1.getName().compareTo(s2.getName());
		TreeSet<Student> ts2=new TreeSet<Student>(comp);
		ts2.add(new Student(101,"Pratik", 78));  //ClassCastException
		ts2.add(new Student(105,"Pratiksha", 68));
		ts2.add(new Student(102,"Kiran", 81));
		System.out.println(ts2);
		
		TreeSet tt=new TreeSet();
		tt.add(10);
		tt.add(6);
		tt.add("abc"); //ClassCastException

	}

}
