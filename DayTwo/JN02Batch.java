package com.tnsif.daytwo;

public class JN02Batch {
	private String UID;
	private String name;
	private String branch;
	private long contactNo;
	private static String collegeName;
	private static String ssTrainer;
	private static String ttTrainer;
	
	static
	{
		System.out.println("In static block");
		collegeName="PVG";
		ssTrainer="Divya";
		ttTrainer="Alpana";
	}
	
	public JN02Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JN02Batch(String uID, String name, String branch, long contactNo) {
		super();
		UID = uID;
		this.name = name;
		this.branch = branch;
		this.contactNo = contactNo;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		JN02Batch.collegeName = collegeName;
	}

	public static String getSsTrainer() {
		return ssTrainer;
	}

	public static void setSsTrainer(String ssTrainer) {
		JN02Batch.ssTrainer = ssTrainer;
	}

	public static String getTtTrainer() {
		return ttTrainer;
	}

	public static void setTtTrainer(String ttTrainer) {
		JN02Batch.ttTrainer = ttTrainer;
	}

	//in static method non static members can't accessible
	/*
	static void change()
	{
		UID="10";
		collegeName="";
	}*/
	
	@Override
	public String toString() {
		return "JN02Batch [UID=" + UID + ", name=" + name + ", branch=" + branch + ", contactNo=" + contactNo + ", College Name="+collegeName+"]";
	}
	
	
	
	
}
