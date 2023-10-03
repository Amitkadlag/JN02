package com.tnsif.daythirteen.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		//Unorder and unsorted set allows unique elements
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(30);
		hs.add(50);
		System.out.println(hs.add(40));
		hs.add(90);
		System.out.println(hs.add(40));
		hs.add(60);
		hs.add(20);
		System.out.println(hs);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		hs.remove(50);
		hs.remove(50000);
		System.out.println(hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(41);
		hs1.add(11);
		hs1.add(40);
		hs1.add(91);
		hs1.add(60);
		hs1.add(61);
		System.out.println("First Set : "+ hs);
		System.out.println("Second Set : "+hs1);
		
		//UNION OF TWO SETS
		hs.addAll(hs1);
		System.out.println("First Set : "+hs);
		hs.clear();
		hs.add(30);
		hs.add(50);
		System.out.println(hs.add(40));
		hs.add(90);
		System.out.println(hs.add(40));
		hs.add(60);
		hs.add(20);
		System.out.println("First Set : "+ hs);
		System.out.println("Second Set : "+hs1);
		
		//SET DIFFERENCE A-B
		hs.removeAll(hs1);
		System.out.println("First Set : "+ hs);
		System.out.println("Second Set : "+hs1);
		
		
		hs.clear();
		hs.add(30);
		hs.add(50);
		System.out.println(hs.add(40));
		hs.add(90);
		System.out.println(hs.add(40));
		hs.add(60);
		hs.add(20);
		System.out.println("First Set : "+ hs);
		System.out.println("Second Set : "+hs1);
		
		//INTERSECTION OF TWO SETS
		hs.retainAll(hs1);
		System.out.println("First Set : "+ hs);
		System.out.println("Second Set : "+hs1);
		
		//Collections.sort(hs);
		List<Integer> l1=new ArrayList<Integer>(hs1);
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
