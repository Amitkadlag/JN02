package com.tnsif.daythirteen.comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GenericListDemo {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>();
		//studentList.add("Aniket");
		studentList.add(new Student(1,"Dhruv",68));
		studentList.add(new Student(4,"Aniket",65));
		studentList.add(new Student(2,"Meet",74));
		studentList.add(new Student(5,"Sanket",69));
		studentList.add(new Student(3,"Likshit",88));
		System.out.println(studentList);
		
	//	Collections.sort(studentList); CTE
		System.out.println("----------- Sort by Per ---------------");
		Collections.sort(studentList, new SortByStudentPer());
		System.out.println(studentList);
		System.out.println("----------- Sort by Name ---------------");
		Collections.sort(studentList, new SortByStudentsName());
		System.out.println(studentList);
	}

}
