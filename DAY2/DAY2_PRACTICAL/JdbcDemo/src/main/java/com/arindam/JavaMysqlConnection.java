package com.arindam;
import java.sql.*;
class TestConnection{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String selectsql="select * from product";
	private String insertsql="insert into product values(?,?,?,?)";
	private String deletesql="delete from product where pid=?";
	private String updatesql="update product set pname=?,pqty=?,price=? where pid=?";
	public void delteData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","arindam");//ESTABLISH THE CONNECTION
		  ps=cn.prepareStatement(deletesql);
		  ps.setString(1,"P3");
		  ps.executeUpdate();//save data
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","arindam");//ESTABLISH THE CONNECTION
		  ps=cn.prepareStatement(updatesql);
		  ps.setString(4,"P2");
		  ps.setString(1,"LAPTOPR");
		  ps.setInt(2, 15);
		  ps.setDouble(3,45000.00);
		  ps.executeUpdate();//save data
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void addData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","arindam");//ESTABLISH THE CONNECTION
		  ps=cn.prepareStatement(insertsql);
		  ps.setString(1,"P3");
		  ps.setString(2,"REFRIGERATOR");
		  ps.setInt(3, 1);
		  ps.setDouble(4,2700.00);
		  ps.executeUpdate();//save data
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		  //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","arindam");//ESTABLISH THE CONNECTION
		  ConnectionFactory con=new ConnectionFactory();
		  cn=con.getConn();
			st=cn.createStatement();//CREATE THE STATEMENT
		  rs=st.executeQuery(selectsql);//EXECUTE THE QUERY AND STORE THE VALUE INTO RESULTSET
		  while(rs.next())
		  {
			  System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"===>"+rs.getInt(3)+"===>"+rs.getDouble(4));
			  //System.out.println(rs.getString(2));
			  //System.out.println(rs.getInt(3));
			  //System.out.println(rs.getDouble(4));
		  }
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
}
public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestConnection ts=new TestConnection();
     //ts.addData();
     //ts.delteData();
    // ts.updateData();
     ts.getData();
	}

}
