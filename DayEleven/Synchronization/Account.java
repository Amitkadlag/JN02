package com.tnsif.dayeleven.synchronization;

public class Account implements Bank{
	private String name;
	private int accNo;
	private float balance;
	
	
	public Account(String name, int accNo, float balance) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	//public synchronized void deposit(float amount) throws DepositLimitExceedsException {
	public  void deposit(float amount) throws DepositLimitExceedsException {
		if (amount>DEPOSIT_LIMIT)
			throw new DepositLimitExceedsException();
		else
			balance =balance+amount;		
	}

	@Override
	//public synchronized  void withdraw(float amount) throws MinimumBalanceException {
	public   void withdraw(float amount) throws MinimumBalanceException {
		if (amount<=balance-MINIMUM_BALANCE)
		{
			balance=balance-amount;
			System.out.println("Withdraw successful...Your current balance is : "+balance);
		}
		else
			throw new MinimumBalanceException();		
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	

}
