package com.tnsif.dayten;

public class WithTryBlock {
	public static void division(int a, int b) {
		float c;
		try {
			c = a / b;
			System.out.println("Division is "+c);
		} catch (ArithmeticException e) {
			System.out.println("Error occurred..." + e.getMessage());
		}
	
	}
}
