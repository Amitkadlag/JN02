package com.tnsif.dayfourteen.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<Integer, String> obj=new GenericClass<Integer, String>();
		obj.setField1(10);
		obj.setField2("Nashik");
		System.out.println(obj.getField1()+", "+obj.getField2());
		
		
		GenericClass<Student, Integer> obj1=new GenericClass<Student, Integer>();
		obj1.setField1(new Student(11,"Amol",66));
		obj1.setField2(70);
		System.out.println(obj1.getField1()+", "+obj1.getField2());
		
		GenericClass<Float, Integer> obj2=new GenericClass<Float, Integer>(56f,78);
		System.out.println(obj2.getField1()+", "+obj2.getField2());
		
		GenericClass<String, Boolean> obj3=new GenericClass<String, Boolean>("madam",true);
		System.out.println(obj3.getField1()+", "+obj3.getField2());
	}

}
