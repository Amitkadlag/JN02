//Function
package com.tnsif.dayfifteen;

@FunctionalInterface
public interface Operations<T> {
	T calculate(T a, T b);
}
