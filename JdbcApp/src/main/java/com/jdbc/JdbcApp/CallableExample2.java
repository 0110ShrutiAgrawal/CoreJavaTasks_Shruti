package com.jdbc.JdbcApp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = null;
		Connection con = null;
		CallableStatement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			stmt = con.prepareCall("{call myprocedure1(?, ?)}");
			stmt.setInt(1, 101);
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
//			boolean status = stmt.execute();
			System.out.println(stmt.getString(2));
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
