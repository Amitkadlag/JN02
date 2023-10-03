package com.tnsif.daysix.singleinheritance;

public class StudentAssessment extends Student {
	private float ssScore;
	private float tsScore;
	public float getSsScore() {
		return ssScore;
	}
	public void setSsScore(float ssScore) {
		this.ssScore = ssScore;
	}
	public float getTsScore() {
		return tsScore;
	}
	public void setTsScore(float tsScore) {
		this.tsScore = tsScore;
	}
	public StudentAssessment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAssessment(String uId, String name, String stream, String batchNo, long contactNo, float ssScore, float tsScore) {
		super(uId, name, stream, batchNo, contactNo);
		//super.uId=uId; private members can't inherited
		this.ssScore = ssScore;
		this.tsScore = tsScore;
	}
	protected void calculateFinalScore()
	{
		finalScore=tsScore*0.8f+ssScore*0.2f;
		System.out.println("Final Score "+finalScore);
	}
	
	@Override
	public String toString() {
		return "Student Details ["+super.toString()+"\r\n ssScore=" + ssScore + ", tsScore=" + tsScore+ "]";
	}
	
	
}
