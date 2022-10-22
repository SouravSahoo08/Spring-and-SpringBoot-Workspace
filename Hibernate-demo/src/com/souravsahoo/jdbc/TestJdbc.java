package com.souravsahoo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "hbstudent";
		String pass = "hbstudent";
		
		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}
