package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JDBC_Example_2 {
	
	public static void main(String[] args) {
		//File f = null;
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("test.properties");
			prop = new Properties();
			prop.load(fis);
			/*
			System.out.println("Driver: - " + prop.getProperty("Driver"));
			System.out.println("URL: - " + prop.getProperty("url"));
			System.out.println("Username: - " + prop.getProperty("uname"));
			System.out.println("Password: - " + prop.getProperty("pswd"));
			*/
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Driver = prop.getProperty("Driver");
		String url = prop.getProperty("url");
		String uname = prop.getProperty("uname");
		String pswd = prop.getProperty("pswd");
		try {
			Class.forName(Driver);//New Driver Class for MacOS
			System.out.println("Class was found");
			//String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection was made");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select contactfirstname, contactlastname, city, customernumber from customers where contactfirstname like 'a%'");
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
