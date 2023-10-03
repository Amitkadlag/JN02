package com.tnsif.dayfourteen.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		Integer a[]= {1,4,6,8,9};
		List<Integer> l=Arrays.asList(a);
		
		Double d[]= {12d,56d,89d,90d,65d};
		List<Double> l1=Arrays.asList(d);
		
		LowerBoundWildCard lbw=new LowerBoundWildCard();
		lbw.show(l);
	//	lbw.show(l1);
		
		UpperBoundWildCard ubw=new UpperBoundWildCard();
		ubw.show(l);
		ubw.show(l1);
	}

}
