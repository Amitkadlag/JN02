package com.tnsif.daythirteen;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st =new Stack<Integer>();
		st.add(5);
		st.add(2);
		st.add(8);
		st.add(3);
		System.out.println(st);
		System.out.println("Topmost element "+st.peek());
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}

	}

}
