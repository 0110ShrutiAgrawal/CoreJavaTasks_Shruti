package com.jdbc.JdbcApp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallableExample {

	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			stmt = con.prepareCall("{call myprocedure()}");
			boolean status = stmt.execute();
			if (status == true) {
				System.out.println("Procedure called successfully");
				System.out.println(stmt.getInt(1) + " " + stmt.getString(2) + " " + stmt.getString(3) + " ");

			} else {
				System.out.println("Procedure could not be called");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
