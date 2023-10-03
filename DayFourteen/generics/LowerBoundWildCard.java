package com.tnsif.dayfourteen.generics;

import java.util.List;

public class LowerBoundWildCard
{
	public void show(List<? super Integer> arr)
	{
		System.out.println(arr);
	}
}
