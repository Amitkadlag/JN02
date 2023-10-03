package com.tnsif.daythirteen;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class GenericListDemo {

	public static void main(String[] args) {
		//allows only String values
		List<String> nameList=new ArrayList<String>();
		nameList.add("Pankaj");
		nameList.add("Aashish");
		nameList.add("Milind");
		nameList.add("Pauras");
		nameList.add("Amol");
		//nameList.add(true); CTE 
		
		System.out.println(nameList);
		
		Collections.sort(nameList);
		System.out.println(nameList);
		System.out.println("---------------------------");
		Iterator<String> it=nameList.iterator();
		while(it.hasNext())
		{
			String name=it.next();
			System.out.println(name.toUpperCase());
			if (name.equals("Pankaj"))
				it.remove();			
		}
		
		System.out.println("---------------------------");
		System.out.println(nameList);
		
		 
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(56);
		numList.add(90);
		numList.add(43);
		numList.add(16);
		numList.add(56);
		numList.add(87);
		//numList.add(45.78f); CTE
		System.out.println(numList);
		
		Iterator<Integer> it1=numList.iterator();
		while(it1.hasNext())
		{
			int no=it1.next();
			System.out.println(no+" : "+no*no);			
		}
		
		Collections.sort(numList);
		System.out.println(numList);
		System.out.println("-------------------------------");
		List<Student> studentList=new ArrayList<Student>();
		//studentList.add("Aniket");
		studentList.add(new Student(1,"Dhruv",68));
		studentList.add(new Student(4,"Aniket",65));
		studentList.add(new Student(2,"Meet",74));
		studentList.add(new Student(5,"Sanket",69));
		studentList.add(new Student(3,"Likshit",88));
		System.out.println(studentList);
		
		//Collections.sort(studentList); CTE
		
		//Using Lambda Expressions
		//Sort by Per
		Comparator<Student> comp=(s2, s1)->(int)(s1.getPer()-s2.getPer());
		Collections.sort(studentList, comp);
		System.out.println("------------------Sort By Percentage----------");
		System.out.println(studentList);
		
		//Sort by name
		comp=(s1, s2)->s1.getName().compareTo(s2.getName());
		Collections.sort(studentList, comp);
		System.out.println("------------------Sort By Name----------");
		System.out.println(studentList);
		
		//Sort by RollNo
		comp=(s1, s2)->s1.getRollNo()-s2.getRollNo();
		Collections.sort(studentList, comp);
		System.out.println("------------------Sort By RollNo----------");
		System.out.println(studentList);
		
	}

}
