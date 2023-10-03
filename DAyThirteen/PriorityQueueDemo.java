package com.tnsif.daythirteen;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String args[])
	{
		Comparator<String> c=(s1,s2)->s2.compareTo(s1);
		PriorityQueue<String> pq=new PriorityQueue<String>(c);
		pq.add("Nashik");
		pq.add("Mumbai");
		pq.add("Pune");
		pq.add("Delhi");
		pq.add("Bangalore");
		pq.add("Akola");
		System.out.println(pq);
		System.out.println("First element : "+pq.peek());
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}

}
