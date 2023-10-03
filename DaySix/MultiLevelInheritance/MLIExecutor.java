package com.tnsif.daysix.multilevelinheritance;

public class MLIExecutor {

	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println("---------------------------");
		Employee e1=new Employee("Abhijeet", 7788990000l,101,56000);
		System.out.println("-----------------------------");
		Manager m1=new Manager("Amol", 7887788778l,100,78000,10,"Assigning Projects ");
		System.out.println("------------------------------");
		System.out.println(e1);
		System.out.println(m1);

		

	}

}
