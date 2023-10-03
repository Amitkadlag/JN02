//Program to define Employee class from Person class
package com.tnsif.daysix.multilevelinheritance;

public class Employee extends Person {
	private int empId;
	private int salary;

	//Constructor
	public Employee() {
		System.out.println("Employee class constructor");
	}

	public Employee(String name, long contactNo, int empId, int salary) {
		super(name, contactNo);
		this.empId=empId;
		this.salary=salary;
	}

	//getter and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	
}
