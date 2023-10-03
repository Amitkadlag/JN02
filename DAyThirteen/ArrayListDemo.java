package com.tnsif.daythirteen;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List rawList=new ArrayList();
		rawList.add(12);
		rawList.add("Hello");
		rawList.add(12.78f);
		rawList.add(true);
		rawList.add("Hello");
		rawList.add(false);
		rawList.add(12);
		rawList.add("Hello");
		rawList.add("Nashik");
		rawList.add("Hello");
		rawList.add(new Date());
		System.out.println(rawList);
		System.out.println( rawList.contains("Hi"));
		System.out.println(rawList.indexOf(12));
		System.out.println(rawList.indexOf("Pune"));
		System.out.println(rawList.lastIndexOf(12));
		System.out.println(rawList.remove(5)+" Removed....");
		System.out.println(rawList);
		System.out.println(rawList.remove("Nashik")+" Removed....");
		System.out.println(rawList);
		System.out.println(rawList.remove("Nashik")+" Removed....");
		System.out.println(rawList);
		
		System.out.println(rawList.remove(rawList.indexOf(12))+" Removed....");
		System.out.println(rawList);
		
		System.out.println(rawList.remove("Hello")+" Removed....");
		System.out.println(rawList);
		
		//exception raised - ClassCastException
		Collections.sort(rawList);
		System.out.println(rawList);
		
		//exception raised - IndexOutOfBoundsExcwption as 12 index is out of bounds for length 6
		System.out.println(rawList.remove(12)+" Removed....");
		System.out.println(rawList);
		
	}

}
