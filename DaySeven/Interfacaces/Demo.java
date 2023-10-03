package com.tnsif.dayseven.interfaces;

public class Demo {

	public static void main(String[] args) {
		//interfaces can't be instantiated directly
		First f;
		//f=new First();
		f=new FirstImpl();
		f.show();
		f.display();
		
		Second s=new SecondImpl();
		s.show();
		s.display();
		System.out.println(s.greet("Students!!"));
		
		//using lambda expression
		Calculate c=(float p,float n,float r)->(p*n*r/100);
		
		System.out.println("Simple Interest is "+c.getSimpleInterest(120000, 5, 7.8f));
		
		
		Employee e=new Employee("Dhruv",6776788800l,101,70000);
		System.out.println(e);
	}

}
