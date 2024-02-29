package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading the driver into memory.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");// establishing
			// connection
			System.out.println("Connection build");
			stmt = con.createStatement();// create statement
			int status = stmt.executeUpdate("delete from employee where empid = 2");
			if (status > 0) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("Record couldn't be deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();// closing connection
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
