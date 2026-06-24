package com.tnsif.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("org.postgresql.Driver");
	System.out.println("load is completed");
	
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prashanth", "postgres", "Pro@2003");
	System.out.println("connection completed");
	
	Statement st=conn.createStatement();
	//update the data
	String sqlupdate="update library set sname='darshan',sbranch='cse' where sid=101";
	System.out.println("the sql statement is:"+sqlupdate);
	int countupdate=st.executeUpdate(sqlupdate);
System.out.println(countupdate+"record update");
}
}

