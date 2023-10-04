package com.tnsif.twentyone;

public class JdbcDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully....");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
