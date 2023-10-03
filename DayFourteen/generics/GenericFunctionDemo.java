package com.tnsif.dayfourteen.generics;

public class GenericFunctionDemo<T> {
	 void display(T[] arr)
	{
		//Index loop
		/*
		 * for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		 */
		//for..each loop
		for(T n:arr)
			System.out.println(n);
	}
	public static void main(String[] args) {
		Integer [] a= {10,4,6,3,7};
		Float[] b= {10f,20f,30f,40f,50f};
		String s[]= {"C","C++", "Java", ",NET", "Python"};
		
		GenericFunctionDemo<Integer> obj=new GenericFunctionDemo<Integer>();
		obj.display(a);
		
		GenericFunctionDemo<Float> obj1=new GenericFunctionDemo<Float>();
		obj1.display(b);
		
		GenericFunctionDemo<String> obj2=new GenericFunctionDemo<String>();
		obj2.display(s);

		GenericFunctionDemo<Student> obj3=new GenericFunctionDemo<Student>();
		Student st[]=new Student[]{new Student(1,"Neha",56f) ,new Student(2,"Pooja",78f),new Student(3,"Ankita",77f)};
		obj3.display(st);
		
	}

}
