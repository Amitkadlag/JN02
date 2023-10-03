package com.tnsif.dayten;

public class UsingFinallyBlock {
	public static void division(int a, int b) {
		float c;
		try {
			System.out.println("---In Try Block-----");
			c = a / b;
			System.out.println("Division is "+c);
			
		} catch (ArithmeticException e) {
			System.out.println("---In Catch Block-----");
			System.out.println("Error occurred..." + e.getMessage());
			//System.exit(0);
		}
		finally
		{
			System.out.println("---In Finally Block-----");
		}
	
	}
}
