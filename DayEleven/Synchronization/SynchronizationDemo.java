package com.tnsif.dayeleven.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account acc=new Account("Amit",10110,10000);
		//Account acc1=new Account("Sumit",10111,50000);
		System.out.println(acc);
		
		AccountThread t1=new AccountThread(acc, 7000);
		AccountThread t2=new AccountThread(acc, 3500);
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("------------------------------------");
		System.out.println(acc);

	}

}
