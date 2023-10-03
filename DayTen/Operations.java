package com.tnsif.dayten;

public class Operations {
	private int a,b;
	
	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void add()
	{
		System.out.println("Addition is "+(a+b));
	}
	
	public void division()throws ArithmeticException
	{
		if (b==0)
			throw new ArithmeticException("Division by zero error...");
		System.out.println("Addition is "+(a/b));	
	}
}
