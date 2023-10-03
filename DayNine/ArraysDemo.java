package com.tnsif.daynine;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {10,3,45,967,879};
			
		Arrays.sort(a);
		for(int n:a)
			System.out.println(n);
		
		int index=Arrays.binarySearch(a, 964);
		System.out.println("Index : "+index);
		
		Arrays.fill(a, 10);
		for(int n:a)
			System.out.print(n+"\t");
		System.out.println();
		int[] arr=a;
		for(int n:arr)
			System.out.print(n+"\t");
		System.out.println("\n"+Arrays.equals(a, arr));
		
		arr[4]=56;
		for(int n:a)
			System.out.print(n+"\t");
		System.out.println();
		for(int n:arr)
			System.out.print(n+"\t");
		System.out.println("\n"+Arrays.equals(a, arr));
		
		int a1[]= {10,10,10,10,56};
		if (a==arr)
			System.out.println("a and arr are same");
		
		if (a==a1)
			System.out.println(" a and a1 are same");
		for(int n:a)
			System.out.print(n+"\t");
		System.out.println();
		for(int n:a1)
			System.out.print(n+"\t");
		System.out.println("\n"+Arrays.equals(a, a1));
		a1[2]=2000;
		for(int n:a)
			System.out.print(n+"\t");
		System.out.println();
		for(int n:a1)
			System.out.print(n+"\t");
		System.out.println("\n"+Arrays.equals(a, a1));
		
		System.out.println(a);
		System.out.println(arr);
		System.out.println(a1);
		
		
		
	}

}
