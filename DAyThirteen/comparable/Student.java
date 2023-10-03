package com.tnsif.daythirteen.comparable;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private float per;
	
	public Student() {
	}
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	//sort based on per 
	/*
	 * @Override public int compareTo(Student o) {
	 * 
	 * return (int) (this.per-o.per); }
	 */
	
	//Sort by name
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	
}
