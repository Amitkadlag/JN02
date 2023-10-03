package com.tnsif.dayseven.interfaces;

public class Employee extends Person implements TaxCalcuation{
	private int empId;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empId, float salary) {
		super();
		this.empId = empId;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, long contactNo, int empId, float salary) {
		super(name, contactNo);
		this.empId=empId;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Gross salary=" + salary + ", Tax="+getTax()+", Net Salary="+(salary-getTax())+"]";
	}
	@Override
	public float getTax() {		
		return salary*0.05f;
	}
	
	
}
