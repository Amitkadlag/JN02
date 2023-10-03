//Program to demonstrate abstraction
package com.tnsif.dayeight.abstraction;


public class AbstractDemo {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Shape shape;
		shape=new Square(12.5f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new Rectangle(10,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
		
		
		
		

	}

}
