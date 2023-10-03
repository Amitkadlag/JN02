//Program to define child class Rectangle from Shape
package com.tnsif.dayseven.abstractclasses;

public class Rectangle extends Shape {
	private float length, breadth;

	public Rectangle() {

	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	//Override Shape class method
	@Override
	public void calArea() {
		area = length * breadth;

	}

}
