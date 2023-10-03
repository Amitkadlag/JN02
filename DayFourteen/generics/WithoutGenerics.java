package com.tnsif.dayfourteen.generics;

public class WithoutGenerics {
	static void display(int[] arr)
	{
		//Index loop
		/*
		 * for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		 */
		//for..each loop
		for(int n:arr)
			System.out.println(n);
	}
	static void display(String[] arr)
	{
		//Index loop
		/*
		 * for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		 */
		//for..each loop
		for(String n:arr)
			System.out.println(n);
	}
	static void display(float[] arr)
	{
		//Index loop
		/*
		 * for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		 */
		//for..each loop
		for(float n:arr)
			System.out.println(n);
	}
	public static void main(String[] args) {
		int [] a= {10,4,6,3,7};
		float[] b= {10,20,30,40,50};
		String s[]= {"C","C++", "Java", ",NET", "Python"};
		display(a);
		display(b);
		display(s);
	}

}
