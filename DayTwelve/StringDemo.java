package com.tnsif.daytwelve;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hi";
		
		System.out.println(s1+" : "+s1.hashCode());
		System.out.println(s2+" : "+s2.hashCode());
		
		String s3="Hello";
		System.out.println(s3+" : "+s3.hashCode());
		
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s1==s2 : "+(s1==s2));
		
		String str1=new String("HELLO");
		String str2=new String("Hello");
		System.out.println(str1+" : "+str1.hashCode());
		System.out.println(str2+" : "+str2.hashCode());
		
		System.out.println("s1==str1 : "+(s1==str1));
		System.out.println("s1==str2 : "+(s1==str2));
		System.out.println("str1.equalsIgnoreCase(s1) : "+s1.equalsIgnoreCase(str1));
		System.out.println("s1.equals(str2) : "+s1.equals(str2));
		
		
		s1+=" How are you?";
		System.out.println(s1+" : "+s1.hashCode());
		System.out.println(s3+" : "+s3.hashCode());
		
		s3=s3.toUpperCase();
		System.out.println(s3+" : "+s3.hashCode());
	}

}

