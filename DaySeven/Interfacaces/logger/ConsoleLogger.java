package com.tnsif.dayseven.interfaces.logger;

public class ConsoleLogger implements MyLogger {

	@Override
	public void log(String message) {
		System.out.println("Console: " + message);
	}
}
