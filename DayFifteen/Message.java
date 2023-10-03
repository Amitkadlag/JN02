//Consumer
package com.tnsif.dayfifteen;

@FunctionalInterface
public interface Message<T> {
	void display(T t);
}
