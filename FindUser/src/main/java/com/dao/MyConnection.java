package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection con;
	
	public static Connection Create() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root"; 
			String password ="Nilesh@cdac";
			String url ="jdbc:mysql://localhost:3306/userproject";
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	
	
}
