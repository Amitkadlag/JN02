package com.tnsif.dayfourteen.generics;

import java.util.List;

public class UpperBoundWildCard
{
	public void show(List<? extends Number> arr)
	{
		System.out.println(arr);
	}
}
