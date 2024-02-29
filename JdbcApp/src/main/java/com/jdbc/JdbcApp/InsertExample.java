package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes?useSSL=false", "root",
					"root");
			System.out.println("Connection Established Successfully....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		try {
			stmt = con.createStatement();
			int status = stmt.executeUpdate("insert into employee(empid, ename, age) values(104, 'Jill', 23)");
			if (status > 0) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("Record couldn't be inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
