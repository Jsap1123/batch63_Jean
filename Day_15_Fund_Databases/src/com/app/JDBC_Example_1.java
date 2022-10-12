package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_Example_1 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//New Driver Class for MacOS
			System.out.println("Class was found");
			//String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Jb@seball11");
			System.out.println("Connection was made");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select contactfirstname, contactlastname, city, customernumber from customers where contactfirstname like 'l%'");
			while(rs.next())
			{
			System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
			}
			//rs.next();
			
			//System.out.println(rs.getString(1) + " " + rs.getString(3) + " " + rs.getString(2) + " " + rs.getString(5));
			
			rs.close();st.close();con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
