package com.tns.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=ac.getBean("e1",Employee.class);
		System.out.println(e);
		
		e=ac.getBean("e2",Employee.class);
		System.out.println(e);
	}

}
