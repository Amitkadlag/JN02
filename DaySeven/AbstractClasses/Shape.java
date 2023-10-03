//Program to define an abstract class Shape
package com.tnsif.dayseven.abstractclasses;

public abstract class Shape {
	protected float area;
	protected static final float PI=3.14f;
	//concrete method
	public void show()
	{
		String shapeName=this.getClass().getName().substring(getClass().getName().lastIndexOf(".")+1);
		System.out.println("Area of "+shapeName+" is "+area);
	}
	//abstract method
	public abstract void calArea();
}
