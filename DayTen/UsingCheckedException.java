package com.tnsif.dayten;

import java.io.*;

public class UsingCheckedException {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your rollNo : ");
		int rno = 0;
		try {
			rno = Integer.parseInt(br.readLine());
			System.out.println("Your rollno is " + rno);
		} 
		//unchecked exception
		catch (NumberFormatException e) { 
			System.out.println("Invalid input "+e.getMessage());
		} 
		//checked Exception
		catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		

	}

}
