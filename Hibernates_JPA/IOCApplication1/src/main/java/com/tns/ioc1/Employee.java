package com.tns.ioc1;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private List<String> skills;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", skills=" + skills + "]";
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public int getEmpId() {
		return empId;
	}
	
}
