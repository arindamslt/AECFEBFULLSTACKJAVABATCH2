package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Client;
import com.arindam.bean.Customer;
import com.arindam.bean.Employee;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
    //Customer cst= (Customer)ac.getBean("cs");
Employee empl=(Employee)ac.getBean("emp");
Client cmp=(Client)ac.getBean("cl");
    //System.out.println(cst);
//System.out.println(empl);
System.out.println(cmp);

	}

}
