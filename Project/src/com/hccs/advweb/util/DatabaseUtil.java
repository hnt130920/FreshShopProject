package com.hccs.advweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil {

	public DatabaseUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {
		Connection conn = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connURL = "jdbc:mysql://localhost:3306/customerdb?characterEncoding=utf8&serverTimezone=UTC";
			String user = "root";
			String pwd = "Candy1412#";
			conn = DriverManager.getConnection(connURL, user, pwd);
		} catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}

}
