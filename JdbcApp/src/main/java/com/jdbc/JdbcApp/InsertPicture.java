package com.jdbc.JdbcApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;


public class InsertPicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading the driver into memory.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");// establishing
																									// connection

			
			System.out.println("Connection build");
			stmt = con.prepareStatement("insert into profile values(?,?)");//create statement

			stmt.setString(1,"flower");
			FileInputStream fs=new FileInputStream("C:\\Users\\91959\\Desktop\\flower.jpg");
			stmt.setBinaryStream(2,fs);  
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("Record couldn't be updated");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				con.close();//closing connection
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
