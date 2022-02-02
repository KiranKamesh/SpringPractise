package com.mouritech.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer cust =(Customer)container.getBean("cust");
		System.out.println(cust);
		System.out.println(cust.getCustName());
		System.out.println(cust.getCustId());
		System.out.println(cust.getCustSalary());
	}

}
