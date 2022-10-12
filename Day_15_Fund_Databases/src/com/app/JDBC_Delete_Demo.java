package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete_Demo {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//New Driver Class for MacOS
			//System.out.println("Class was found");
			//String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Jb@seball11");
			
			PreparedStatement psmt = con.prepareStatement("delete from student where stno=?");
			
			psmt.setInt(1, 4);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " RECORD WAS DELETED");
			System.out.println();
			psmt.close();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+ rs.getString(3));
			}
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
