package com.tnsif.dayfive;

public class SampleExecutor {

	public static void main(String[] args) {
		Sample s=new Sample();
		//private members can't be accessible
		//s.privateNo=100;
		s.defaultNo=200;
		s.no=400;
		s.protectedNo=300;
		System.out.println(s);
	}

}
