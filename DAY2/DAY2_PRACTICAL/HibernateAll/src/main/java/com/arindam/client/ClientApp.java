package com.arindam.client;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.arindam.entity.Adhar;
import com.arindam.entity.Customer;
import com.arindam.entity.Employee;
import com.arindam.entity.Student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  EntityTransaction tx=null;
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");//READING JDBC CONFIGURATION FROM XML FILE
  EntityManager em=emf.createEntityManager();//adding updating delete create table
	tx=em.getTransaction();//TRNSACTION CREATED
	tx.begin();//BEGIN THE TRANSACTION
	//Student sd1=new Student("100","ARUP","IT");
	//em.persist(sd1);//TABLE CREATED DATA INSERTED
	/*Employee  emp1=new Employee();
	Employee  emp2=new Employee();
	emp1.setEname("SUMAN");
	emp1.setEdesig("MANAGER");
	emp1.setSal(65000.00);
	emp1.setHiredt(new Date());
	emp1.setWorkhr(new Date());
	emp2.setEname("ALOKE");
	emp2.setEdesig("ANALYST");
	emp2.setSal(55000.00);
	emp2.setHiredt(new Date());
	emp2.setWorkhr(new Date());
	em.persist(emp1);
	em.persist(emp2);*/
	Adhar ah1=new Adhar("dgdgtdd123","KOLKATA");
	Adhar ah2=new Adhar("tyrtrrt24","CHENNAI");
	Customer cs1=new Customer("C1","ANNANYA",ah1);
	Customer cs2=new Customer("C2","AYAN",ah2);
	em.persist(ah1);
	em.persist(ah2);
	em.persist(cs1);
	em.persist(cs2);
	tx.commit();//save data
	emf.close();
	}

}
