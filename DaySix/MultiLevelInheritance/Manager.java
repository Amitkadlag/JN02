//Program to define Manager class from Employee class
package com.tnsif.daysix.multilevelinheritance;

public class Manager extends Employee {
	private int teamSize;
	private String taskAllocation;
	public Manager() {
		System.out.println("Manager class constructor");
	}

	public Manager(String name, long contactNo, int empId, int salary, int teamSize, String taskAllocation) {
		super(name, contactNo, empId, salary);
		this.teamSize=teamSize;
		this.taskAllocation=taskAllocation;				
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getTaskAllocation() {
		return taskAllocation;
	}

	public void setTaskAllocation(String taskAllocation) {
		this.taskAllocation = taskAllocation;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", taskAllocation=" + taskAllocation + ", toString()="
				+ super.toString() + "]";
	}

	
}
