package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtTask {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
            stmt = con.prepareStatement("update employee set ename=? where empid=?");
            stmt.setString(1, "Hughes");
            stmt.setInt(2, 104);
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
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
