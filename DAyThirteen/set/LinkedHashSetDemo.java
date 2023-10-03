package com.tnsif.daythirteen.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Ordered Set
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		lhs.add(40);
		lhs.add(50);
		lhs.add(20);
		lhs.add(90);
		lhs.add(70);
		lhs.add(90);
		System.out.println(lhs);
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	//	Collections.sort(lhs);
	}

}
