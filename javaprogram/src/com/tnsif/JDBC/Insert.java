package com.tnsif.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//demo for insert and delete
public class Insert {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("org.postgresql.Driver");
	System.out.println("load is completed");
	
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prashanth", "postgres", "Pro@2003");
	System.out.println("connection completed");
	
	Statement st=conn.createStatement();
	
	
	//inserting the data into database
	
	String sqlinsert="insert into library values(104,'Achyuth','ENC')";
	
	System.out.println("The sql statement is :"+sqlinsert);
	
	int countinserted=st.executeUpdate(sqlinsert);
	System.out.println(countinserted +"record inserted");
	
	
	 //deleteting the data into database
	
	//String sqldelete="delete from library where sid=103";
	//System.out.println("the sql statement is "+sqldelete);
	
	//int countdeleted=st.executeUpdate(sqldelete);
	//System.out.println(countdeleted +"record deleted ");
}
}

	


