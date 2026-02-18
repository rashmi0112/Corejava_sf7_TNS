package com.tnsif.jdbcprogram;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//
public class Jdbcprogram 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1: load and register the driver
		
		Class.forName("org.postgresql.Driver");
		
		// step 2: Establishing connection
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/nagarjuna", "postgres", "rashmi");

		// step 3: create statement
		Statement st = conn.createStatement();
		
//		// step 4: prepare a query
//		String query=" select * from students";
//		
//		// step 5: reading the data
//		ResultSet rs=st.executeQuery(query);
//		
//		while(rs.next()) 
//		{
//		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
//		}
	//// close the statement

		// inserting the data

		 // String sqlinsert="insert into students values(3,'hema','sushma@gmail.com')";
		 // System.out.println("the sql query statement updated");
		 //  int inserted=st.executeUpdate(sqlinsert);
		//   
		   // delete record from the students 
		   
		   String sqldelete="delete from students where sid=3";
		   
		   int deletequery=st.executeUpdate(sqldelete);
		   System.out.println("delete updated");

		st.close();
		conn.close();
		
}
}
