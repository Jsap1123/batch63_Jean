package com.jdbc.student;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//import com.jdbc.Student;

public class Student_Object_Write {
	
	public static void main(String[] args) {
		
		File f = new File("test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			List<Student> std = new ArrayList<>();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");//New Driver Class for MacOS
					System.out.println("Class was found");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Jb@seball11");
				
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from student");
					while(rs.next())
					{
						Student s = new Student();
						s.setStno(rs.getInt(1));
						s.setStname(rs.getString(2));
						s.setEmail(rs.getString(3));
						std.add(s);
					}
					
					oos.writeObject(std);
					System.out.println("Connection was made");
					rs.close();st.close();con.close();
					
			
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
}
