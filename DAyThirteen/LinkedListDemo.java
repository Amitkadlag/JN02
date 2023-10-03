package com.tnsif.daythirteen;

import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cityList = new LinkedList<String>();
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Nashik");
		cityList.add("Mumbai");

		System.out.println(cityList);
		cityList.addFirst("Bangalore");
		System.out.println(cityList);
		cityList.addLast("Nagpur");
		System.out.println(cityList);
		Collections.sort(cityList);
		System.out.println(cityList);

		System.out.println(cityList.get(4));
		System.out.println(cityList.getFirst());
		System.out.println(cityList.getLast());

		System.out.println(cityList.removeFirst());
		System.out.println(cityList.removeLast());

		System.out.println(cityList);

		ListIterator<String> lit = cityList.listIterator();

		while (lit.hasNext())
			System.out.print(lit.next() + "\t");

		System.out.println("---------------------------------------");
		lit = cityList.listIterator(cityList.size());
		while (lit.hasPrevious())
		{
			String city=lit.previous() ;
			System.out.print(city+ "\t");
			if (city.equals("Mumbai"))
				lit.set("Pune");
			if (city.equals("Delhi"))
				lit.add("Bangalore");
			if (city.equals("Nagpur"))
				lit.remove();
		}
		System.out.println("---------------------------");
		System.out.println(cityList);

	}

}
