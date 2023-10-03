package com.tnsif.dayfifteen;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
	//	Statement s=()->{return ("Good Morning Students!!");};
		Statement s=()->"Good Morning Students!!";
		System.out.println(s.show());
		
		s=()->"Hello";
		System.out.println(s.show());
		
		
		Message<Integer> m=(n)->System.out.println(n+" is of Integer type");
		m.display(10);
		
		Message<String> m1=(str)->System.out.println("Length of "+str+" is "+str.toString().length());
		m1.display("Hello");
		
		Message mm=(value)->System.out.println("Value is "+value);
		mm.display(20);
		mm.display("JN02 Batch");
		mm.display(true);
		
		
		Operations<Integer> o1=(n1, n2)->n1+n2;
		System.out.println("Result is "+o1.calculate(10, 20));
		
		o1=(n1, n2)->n1-n2;
		System.out.println("Result is "+o1.calculate(10, 20));
		
		o1=(n1, n2)->n1*n2;
		System.out.println("Result is "+o1.calculate(10, 20));
		
		Operations<String> o2=(n1, n2)->n1+n2;
		System.out.println("Result is "+o2.calculate("10", "20"));
		
		o1=(n1, n2)->n1>n2?n1:n2;
		System.out.println("Result is "+o1.calculate(10, 20));	
			
		Check<String> c1=(str)->str.toString().isEmpty();
		String msg="";
		System.out.println("Is "+msg+" empty? "+c1.isValidate(msg));
		
		msg="Hello";
		System.out.println("Is "+msg+" empty? "+c1.isValidate(msg));
		
		Check<Integer> c2=(n)->n>=0;
		int no=10;
		System.out.println(no+" is positive? "+c2.isValidate(no));
		
		no=-10;
		System.out.println(no+" is positive? "+c2.isValidate(no));
		
		c2=(n)->n%2==0;
		no=10;
		System.out.println(no+" is Even? "+c2.isValidate(no));
		
		no=101;
		System.out.println(no+" is Even? "+c2.isValidate(no));
		
			
	}

}
