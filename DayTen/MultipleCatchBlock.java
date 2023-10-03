package com.tnsif.dayten;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String args[]) {
		try {
			int a[] = { 12, 45, 67, 78 };
			for (int e : a)
				System.out.print(e + "\t");
			int index, value;
			System.out.println("Enter the index to update ");
			Scanner sc = new Scanner(System.in);
			index = sc.nextInt();
			System.out.println("Enter the value to update ");
			value = sc.nextInt();
			try {
				a[index] = value;
				a=null;
				for (int i = 0; i < a.length; i++)
					System.out.println(a[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index is out of bounds ");
			}
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("Invalid input");
		}

		/*
		 * catch(ArithmeticException e) { System.out.println("Division by Zero Error");
		 * }
		 */

		catch (Exception e) {
			System.out.println("Error Occurred... " + e);
		}

		System.out.println("---------------------------------------------");

	}
}
