package com.tnsif.dayeleven.synchronization;

public class MinimumBalanceException extends Throwable {
	public MinimumBalanceException()
	{
		super("Withdraw fail! reached Minumum balance....");
	}
	public MinimumBalanceException(String message)
	{
		super(message);
	}
}
