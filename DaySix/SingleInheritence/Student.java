package com.tnsif.daysix.singleinheritance;

public class Student {
	private String uId;
	private String name;
	private String stream;
	private String batchNo;
	private static String collegeName;
	private static String ssTrainer;
	private static String tsTrainer;
	private long contactNo;
	protected float finalScore;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String uId, String name, String stream, String batchNo, long contactNo) {
		super();
		this.uId = uId;
		this.name = name;
		this.stream = stream;
		this.contactNo = contactNo;
		this.batchNo=batchNo;
	}


	
	public String getuId() {
		return uId;
	}


	public void setuId(String uId) {
		this.uId = uId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public String getBatchNo() {
		return batchNo;
	}


	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}


	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	public static String getSsTrainer() {
		return ssTrainer;
	}
	public static void setSsTrainer(String ssTrainer) {
		Student.ssTrainer = ssTrainer;
	}
	public static String getTsTrainer() {
		return tsTrainer;
	}
	public static void setTsTrainer(String tsTrainer) {
		Student.tsTrainer = tsTrainer;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Student [UID=" + uId + ", name=" + name + ", stream=" + stream + ", batchNo=" + batchNo + ", contactNo="
				+ contactNo + "]";
	}	
}
