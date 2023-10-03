//Program to use "plug and play" with different implementations of Logger
package com.tnsif.dayseven.interfaces.logger;

public class LoggerDemo {

	public static void main(String[] args) {

		MyLogger logger = new ConsoleLogger();  //Log to Console
		logger.log("This message will be logged.");

		logger = new FileLogger(); //Log to File
		logger.log("This message will be logged into File.");
	}

}
