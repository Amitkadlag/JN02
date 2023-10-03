package com.tnsif.dayten;

public class InvalidAgeException extends Throwable {
	public InvalidAgeException()
	{
		super("Age not valid");
	}
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
