//Program to define child class Circle from Shape
package com.tnsif.dayseven.abstractclasses;

public class Circle extends Shape {
	private float radius;

	public Circle() {

	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	//Override Shape class method
	@Override
	public void calArea() {
		area = Shape.PI * radius * radius;
	}
}
