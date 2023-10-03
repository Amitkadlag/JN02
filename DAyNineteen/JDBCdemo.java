package com.tnsif.daynineteen;

public class JDBCDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully......");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
