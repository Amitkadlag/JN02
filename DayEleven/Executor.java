package com.tnsif.dayeleven;

public class Executor {

	public static void main(String[] args) {
		ChildThreadOne t1=new ChildThreadOne("First");
		ChildThreadOne t2=new ChildThreadOne("Second");
	//	t1.start();
	//	t2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------End of main()----------");

	}

}
