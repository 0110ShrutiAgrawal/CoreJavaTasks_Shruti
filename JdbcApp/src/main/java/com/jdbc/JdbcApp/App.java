package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading driver into memory
			// Establishing connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Connection Established Successfully....");
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement(); // create statements
			rs = stmt.executeQuery("select * from employee"); // Executing SQL query
			while (rs.next()) // Handling result set
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // closing the connection
		}
	}
}