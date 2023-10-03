package com.tnsif.daysix.singleinheritance;

public class SIExecutor {

	public static void main(String[] args) {
		StudentAssessment obj=new StudentAssessment();
		obj.setuId("TC05040201");
		obj.setName("Sakshi");
		obj.setStream("IT");
		obj.setContactNo(987677777700l);
		obj.setBatchNo("TC050402");
		Student.setSsTrainer("Divya");
		Student.setTsTrainer("Alpana");
		Student.setCollegeName("PVG, Nashik");
		obj.setSsScore(78.50f);
		obj.setTsScore(80);
		System.out.println(obj);
		System.out.println("College : "+Student.getCollegeName()+"\tSoftskill Trainer "+Student.getSsTrainer()+"\tTechnical Trainer "+Student.getTsTrainer());
		obj.calculateFinalScore();
		StudentAssessment obj1=new StudentAssessment("TC05040202", "Poonam", "CSE","TC050402", 7689898000l, 87, 69);
		System.out.println(obj1);
		System.out.println("College : "+Student.getCollegeName()+"\tSoftskill Trainer "+Student.getSsTrainer()+"\tTechnical Trainer "+Student.getTsTrainer());
		obj1.calculateFinalScore();
	}

}
