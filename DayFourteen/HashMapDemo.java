package com.tnsif.dayfourteen;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// ordered, unsorted dictionary, null keys and values allowed
		//It is not thread safe
		  LinkedHashMap<String, String> ht=new LinkedHashMap<String, String>();
		  ht.put("aniket@gmail.com", "Aniket"); ht.put("neha.pawar@gmail.com", "Neha");
		  ht.put("lisha@gmail.com", "Lisha"); ht.put("pratik@gmail.com", "Pratik");
		  ht.put("meet@gmail.com", "Meet"); ht.put("dhruv@gmail.com", "Dhruv");
		  System.out.println(ht);
		  System.out.println("------------------------------------");
		  ht.put("aniket@gmail.com", "Aniket Songire"); ht.put("nidhi123@gmail.com",
		  "Nidhi"); ht.put("pratik123@gmail.com", "Pratik");
		  ht.put("pratik123@gmail.com", null); 
		  ht.put(null,"Pratik"); 
		  System.out.println(ht);
		  System.out.println("--------------------------------"); 
		  Set<String> e=ht.keySet();
		  Iterator<String> it=e.iterator();
		  while(it.hasNext()) { 
			  String key=it.next();
			  System.out.println(key+ " : "+ht.get(key)); }
		 

		
		  LinkedHashMap<String, Float> ht1 = new LinkedHashMap<String, Float>();
		  ht1.put("TC05040201", 80f); 
		  ht1.put("TC050402011", 60.60f);
		  ht1.put("TC050402021", 82f); 
		  ht1.put("TC050402031", 70.50f);
		  ht1.put("TC050402012", 84f); 
		  System.out.println(ht1);
		  System.out.println("----------------------------------");
		  ht1.replace("TC050402031", 80.50f); 
		  ht1.replace("TC050402031", 80.50f);
		  System.out.println(ht1);
		
		  LinkedHashMap<Student,String> ht2=new LinkedHashMap<Student,String>(); ht2.put(new
		  Student(5, "Sakshi",76), "Pune"); ht2.put(new Student(8, "Nivedita",69),
		  "Mumbai"); ht2.put(new Student(1, "Komal",56), "Delhi");
		  System.out.println(ht2);
		 
	}

}
