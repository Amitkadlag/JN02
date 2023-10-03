package com.tnsif.dayseven.interfaces;

@FunctionalInterface
public interface Calculate {
	float getSimpleInterest(float p, float n, float r);
//Functional interface has only one abstract method
//	void show();
}
