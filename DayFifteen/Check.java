//Predicate
package com.tnsif.dayfifteen;

@FunctionalInterface
public interface Check<T> {
	boolean isValidate(T a);
}
