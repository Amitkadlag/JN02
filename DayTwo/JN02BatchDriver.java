package com.tnsif.daytwo;

public class JN02BatchDriver {

	public static void main(String[] args) {
		System.out.println("---------In Main--------");
		System.out.println(JN02Batch.getCollegeName());
		System.out.println(JN02Batch.getSsTrainer());
		System.out.println(JN02Batch.getTtTrainer());
		
		JN02Batch s1,s2,s3;
		s1=new JN02Batch("TC05040201","Aditya Shriram Borade","CSE",7420993968l);
		s2=new JN02Batch("TC05040202","Akansha Baban Shelke","E&TC",7385828729l);
		s3=new JN02Batch("TC05040203",	"Akash Kiran Chavan","CSE",	9139569900l);
		
		JN02Batch.setCollegeName("PVG, Nashik");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(JN02Batch.getCollegeName());
	}

}
