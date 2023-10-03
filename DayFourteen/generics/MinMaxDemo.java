package com.tnsif.dayfourteen.generics;

public class MinMaxDemo {

	public static void main(String[] args) {
		Integer arr[] = { 1, 7, 4, 6 };
		MinMaxImpl<Integer> obj = new MinMaxImpl<Integer>(arr);
		System.out.println(obj.getMin());
		System.out.println(obj.getMax());
		
		
		Float arr1[] = { 1f, 7f, 4f, 6f };
		MinMaxImpl<Float> obj1 = new MinMaxImpl<Float>(arr1);
		System.out.println(obj1.getMin());
		System.out.println(obj1.getMax());
		
		Long arr2[] = { 1l, 7l, 4l, 6l };
		MinMaxImpl<Long> obj2 = new MinMaxImpl<Long>(arr2);
		System.out.println(obj2.getMin());
		System.out.println(obj2.getMax());
		
		String arr3[] = { "1", "7", "4", "6" };
		//MinMaxImpl<String> obj = new MinMaxImpl<String>(arr3);
		
	}

}
