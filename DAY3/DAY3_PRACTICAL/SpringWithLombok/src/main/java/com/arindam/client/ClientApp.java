package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Customer;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
Customer cst=(Customer)ac.getBean("cs");
System.out.println(cst);
	}

}
