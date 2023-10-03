package com.tnsif.dayfifteen;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionaInterfaceDemo {

	public static void main(String[] args) {
	//	Supplier s=()->{return ("Good Morning Students!!");};
		Supplier<String> s=()->"Good Morning Students!!";
		System.out.println(s.get());
		
		Supplier<Integer> s1=()->10;
		System.out.println(s1.get());
		
		
		Consumer<Integer> m=(n)->System.out.println(n+" is of Integer type");
		m.accept(10);
		
		Consumer<String> m1=(str)->System.out.println("Length of "+str+" is "+str.toString().length());
		m1.accept("Hello");
		
		Consumer mm=(value)->System.out.println("Value is "+value);
		mm.accept(20);
		mm.accept("JN02 Batch");
		mm.accept(true);
		
		
		BiFunction<Integer, Integer, Integer> o1=(n1, n2)->n1+n2;
		System.out.println("Result is "+o1.apply(10, 20));
		
		o1=(n1, n2)->n1-n2;
		System.out.println("Result is "+o1.apply(10, 20));
		
		o1=(n1, n2)->n1*n2;
		System.out.println("Result is "+o1.apply(10, 20));
		
		BiFunction<String, String, String> o2=(n1, n2)->n1+n2;
		System.out.println("Result is "+o2.apply("10", "20"));
		
		o1=(n1, n2)->n1>n2?n1:n2;
		System.out.println("Result is "+o1.apply(10, 20));	
			
		Predicate<String> c1=(str)->str.toString().isEmpty();
		String msg="";
		System.out.println("Is "+msg+" empty? "+c1.test(msg));
		
		msg="Hello";
		System.out.println("Is "+msg+" empty? "+c1.test(msg));
		
		Predicate<Integer> c2=(n)->n>=0;
		int no=10;
		System.out.println(no+" is positive? "+c2.test(no));
		
		no=-10;
		System.out.println(no+" is positive? "+c2.test(no));
		
		c2=(n)->n%2==0;
		no=10;
		System.out.println(no+" is Even? "+c2.test(no));
		
		no=101;
		System.out.println(no+" is Even? "+c2.test(no));
		
			
	}

}
