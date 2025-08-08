package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		//load the context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Fetch the bean
		Customer cust = context.getBean("customer", Customer.class);
		
		//Access the Variables
		System.out.println(cust.getName());
		
		Address addr = (Address) context.getBean("address");
		
		System.out.println(addr.getCityName());
	}

}
