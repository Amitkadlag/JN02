package com.tnsif.dayseventeen;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		//creating stream from set of values
		Stream<Integer> stream=Stream.of(2,4,5,6,7,-5,-3,8);
		
		//reduce - find sum of all values
		Optional<Integer> sum=stream.reduce((a,b)->a+b);
		if (sum.isPresent())
			System.out.println("Sum of values : "+sum.get());
		
		stream=Stream.of(2,4,5,6,7,-5,-3,8);
		
		//reduce - find sum of all values
		Optional<Integer> max=stream.reduce((a,b)->a>b?a:b);
		if (max.isPresent())
			System.out.println("maximum of values : "+max.get());

	}

}
