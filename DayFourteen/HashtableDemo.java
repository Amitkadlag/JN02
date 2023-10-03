package com.tnsif.dayfourteen;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		// unordered, unsorted dictionary, It is thread safe, null keys and values not allowed
		/*
		 * Hashtable<String, String> ht=new Hashtable<String, String>();
		 * ht.put("aniket@gmail.com", "Aniket"); ht.put("neha.pawar@gmail.com", "Neha");
		 * ht.put("lisha@gmail.com", "Lisha"); ht.put("pratik@gmail.com", "Pratik");
		 * ht.put("meet@gmail.com", "Meet"); ht.put("dhruv@gmail.com", "Dhruv");
		 * System.out.println(ht);
		 * System.out.println("------------------------------------");
		 * ht.put("aniket@gmail.com", "Aniket Songire"); ht.put("nidhi123@gmail.com",
		 * "Nidhi"); ht.put("pratik123@gmail.com", "Pratik");
		 * //ht.put("pratik123@gmail.com", null); //NullPointerException //ht.put(null,
		 * "Pratik"); //NullPointerException System.out.println(ht);
		 * System.out.println("--------------------------------"); Enumeration<String>
		 * e=ht.keys(); while(e.hasMoreElements()) { String key=e.nextElement();
		 * System.out.println(key+ " : "+ht.get(key)); }
		 */

		/*
		 * Hashtable<String, Float> ht1 = new Hashtable<String, Float>();
		 * ht1.put("TC05040201", 80f); ht1.put("TC050402011", 60.60f);
		 * ht1.put("TC050402021", 82f); ht1.put("TC050402031", 70.50f);
		 * ht1.put("TC050402012", 84f); System.out.println(ht1);
		 * System.out.println("----------------------------------");
		 * ht1.replace("TC050402031", 80.50f); Enumeration<String> e = ht1.keys(); while
		 * (e.hasMoreElements()) { String key = e.nextElement(); Float per =
		 * ht1.get(key); if (per >= 80) System.out.println(key + " : " + per); }
		 * ht1.replace("TC050402031", 80.50f);
		 */
		
		Hashtable<Student,String> ht2=new Hashtable<Student,String>();
		ht2.put(new Student(5, "Sakshi",76), "Pune");
		ht2.put(new Student(8, "Nivedita",69), "Mumbai");
		ht2.put(new Student(1, "Komal",56), "Delhi");
		System.out.println(ht2);
	}

}
