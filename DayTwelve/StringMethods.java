package com.tnsif.daytwelve;

public class StringMethods {

	public static void main(String[] args) {
		String s=new String("Strings are constant; their values cannot be changed after they\r\n"
				+ " are created. String buffers support mutable strings.\r\n"
				+ " Because String objects are immutable they can be shared.");
		System.out.println(s);
		System.out.println("Length : "+s.length());
		System.out.println("char at 5 : "+s.charAt(5));
		System.out.println("index of String : "+s.indexOf("String"));
		System.out.println("index of String : "+s.indexOf("String",10));
		System.out.println("index of String : "+s.lastIndexOf("String"));
		String str=s.substring(8,11);
		System.out.println(str);
		
		System.out.println(s.startsWith("Strings"));
		System.out.println(s.endsWith("."));
		
		String s1="Hello";
		String s2="Hi";
		String s3="Hello";
		System.out.println(s3.compareTo(s1));
		System.out.println("------------------------------------");
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb);
		sb.append(", How are you?");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(6, 7, "!");
		System.out.println(sb);
		s1=sb.toString();
		System.out.println(s1);
	}
}
