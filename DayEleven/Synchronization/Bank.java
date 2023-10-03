//program to declare Bank interface
package com.tnsif.dayeleven.synchronization;

public interface Bank {
	//fields - static and final by default
	float MINIMUM_BALANCE=1000;
	float DEPOSIT_LIMIT=25000;
	String BANK_NAME="SBI";
	
	//methods - public and abstract
	void deposit(float amount) throws DepositLimitExceedsException;
	void withdraw(float amount)throws MinimumBalanceException;
}
