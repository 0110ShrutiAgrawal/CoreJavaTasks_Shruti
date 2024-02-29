package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int status = stmt.executeUpdate("update employee set ename=\"Shruti Agrawal\" where empid = 3");
			if (status > 0) {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("Record couldn't be updated");
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
