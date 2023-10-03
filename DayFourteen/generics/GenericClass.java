package com.tnsif.dayfourteen.generics;

public class GenericClass<T1, T2> {
	T1 field1;
	T2 field2;
	public GenericClass() {}
	public GenericClass(T1 field1, T2 field2)
	{
		this.field1=field1;
		this.field2=field2;
	}
	public T1 getField1() {
		return field1;
	}
	public T2 getField2()
	{
		return field2;
	}

	public void setField1(T1 field1)
	{
		this.field1=field1;
	}
	public void setField2(T2 field2)
	{
		this.field2=field2;
	}
}
