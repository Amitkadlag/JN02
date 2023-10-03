//Program to define child class Square from Shape
package com.tnsif.dayseven.abstractclasses;

public class Square extends Shape {
	private float side;
	public Square() {
		
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	//Override Shape class method
	@Override
	public void calArea() {
		area=side*side;
	}

}
