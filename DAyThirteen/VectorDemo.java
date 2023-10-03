package com.tnsif.daythirteen;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//ordered list
		//Thread safe
		Vector<Integer> v=new Vector<Integer>(4); //default capacity 10
		System.out.println(v+" size : "+v.size()+" capacity : "+v.capacity());
		v.add(10);
		v.add(60);
		v.add(10);
		v.add(30);
		v.add(10);
		System.out.println(v+" size : "+v.size()+" capacity : "+v.capacity());
		v.add(60);
		v.add(10);
		v.add(30);
		v.add(10);
		v.add(60);
		v.add(10);
		//v.add(30);
		System.out.println(v+" size : "+v.size()+" capacity : "+v.capacity());
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(v+" size : "+v.size()+" capacity : "+v.capacity());
		
	}

}
