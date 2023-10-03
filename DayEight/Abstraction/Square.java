//Program to demonstrate abstraction
package com.tnsif.dayeight.abstraction;

public class Square extends Shape{
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}
}

