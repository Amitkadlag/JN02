package com.tnsif.dayten;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException {
		if (age<18)
			throw new InvalidAgeException();
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) throws InvalidAgeException {
		super();
		this.name = name;
		if (age<18)
			throw new InvalidAgeException("Sorry age is less than 18.. unable to vote");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
