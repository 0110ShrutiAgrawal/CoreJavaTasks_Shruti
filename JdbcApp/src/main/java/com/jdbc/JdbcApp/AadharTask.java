package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class AadharTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading driver into memory
			// Establishing connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			System.out.println("Connection Established Successfully....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement(); // create statements
			rs = stmt.executeQuery("select * from aadhar"); // Executing SQL query
			while (rs.next()) // Handling result set
				System.out.println(rs.getLong(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getString(5) + "  " + rs.getLong(6));
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