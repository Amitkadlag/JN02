package com.tnsif.dayeleven.synchronization;

public class AccountThread extends Thread {
	private Account acc;
	private float amount;
	
	public AccountThread(Account acc, float amount)
	{
		this.acc=acc;
		this.amount=amount;
		start();
	}
		
	@Override
	public void run()
	{
		try {
			synchronized (acc) {
				acc.withdraw(amount);
				System.out.println(currentThread().getName());
			}
			
		} catch(MinimumBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
