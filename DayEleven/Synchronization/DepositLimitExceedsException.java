package com.tnsif.dayeleven.synchronization;

public class DepositLimitExceedsException extends Throwable {
	public DepositLimitExceedsException()
	{
		super("Deposit fail! Deposit limit is exceeded...");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
