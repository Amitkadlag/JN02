package com.tnsif.dayfourteen.generics;

public class MinMaxImpl<T extends Number> implements MinMax<T> {
	T[] arr;
	
	public MinMaxImpl(T arr[])
	{
		this.arr=arr;
	}

	@Override
	public T getMin() {
		
		T min=arr[0];
		for(int i=1;i<arr.length;i++)
			if (min.intValue()>arr[i].intValue())
				min=arr[i];
		return min ;
	}

	@Override
	public T getMax() {
		T max=arr[0];
		for(int i=1;i<arr.length;i++)
			if (max.intValue()<arr[i].intValue())
				max=arr[i];
		return max ;
	}

}
