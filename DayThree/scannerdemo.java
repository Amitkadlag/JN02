package com.tnsif.daythree;

import java.util.*;
public class ScannerDemo {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		no=sc.nextInt();
		int arr[]=new int[no];
		System.out.println("Array size : "+arr.length);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("----------------------------------");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("------------------------");
		int arr1[]= {1,5,3,9,7};
		System.out.println("----------------------------------");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+"\t");
		
		arr1[30]=90;
		System.out.println("----------------------------------");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+"\t");
		
		
	}

}
