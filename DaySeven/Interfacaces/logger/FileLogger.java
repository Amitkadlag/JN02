package com.tnsif.dayseven.interfaces.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements MyLogger {
	@Override
	public void log(String message) {
		File f = new File("test.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			fw.write(message);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
