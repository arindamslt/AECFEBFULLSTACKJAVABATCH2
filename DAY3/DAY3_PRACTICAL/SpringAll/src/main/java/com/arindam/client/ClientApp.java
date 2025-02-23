package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Category;
import com.arindam.bean.Client;
import com.arindam.bean.Customer;
import com.arindam.bean.Employee;
import com.arindam.bean.Test;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
    //Customer cst= (Customer)ac.getBean("cs");
Employee empl=(Employee)ac.getBean("emp");
//Client cmp=(Client)ac.getBean("cl");
    //System.out.println(cst);
//System.out.println(empl);
//System.out.println(cmp);
//Category cgs=(Category)ac.getBean("cg");
//System.out.println(cgs);
Test t1=(Test)ac.getBean("tst");
Test t2=(Test)ac.getBean("tst");
t1.setTestid("T1");
t1.setTestnm("COREJAVATESTING");
t1.setTestduration(15);
t1.setTsoftware("JUNIT");
t2.setTestid("T2");
t2.setTestnm("INTEGRATIONTESTING");
t2.setTestduration(25);
t2.setTsoftware("SELENIUM");
System.out.println(t1);
System.out.println(t2);

	}

}
