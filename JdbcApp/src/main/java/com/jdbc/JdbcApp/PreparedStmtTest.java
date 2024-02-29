package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtTest {

	public static void main(String[] args) {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			System.out.println("Connection Established Successfully....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		PreparedStatement stmt = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter empid:");
			int id = sc.nextInt();
			stmt = con.prepareStatement("update employee set ename=? where empid=?");
			stmt.setString(1, name);
			stmt.setInt(2, id);
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Record Updated Successfully");
			} else {
				System.out.println("Record updation failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (sc != null) {
					sc.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
