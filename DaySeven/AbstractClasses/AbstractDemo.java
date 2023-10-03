//Program to demonstrate abstraction and run time polymorphism
package com.tnsif.dayseven.abstractclasses;

public class AbstractDemo {

	public static void main(String[] args) {
		//can't instantiate an abstract class Shape
		Shape s;
		//s=new Shape();
		
		s=new Square(4.5f);
		//dynamic binding using method overriding
		s.calArea();
		s.show();
		
		s=new Rectangle(12, 23);
		//dynamic binding using method overriding
		s.calArea();
		s.show();
		
		s=new Circle(3.5f);
		//dynamic binding using method overriding
		s.calArea();
		s.show();

	}

}
