package com.arindam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	Connection cn=null;
public Connection getConn()
{
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
	  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","arindam");//ESTABLISH THE CONNECTION
	  
	}
	catch(ClassNotFoundException ce)
	{
		ce.printStackTrace();
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	return cn;
}
}
