package com.jdbc.bank.AbcdBank;

import java.sql.*;
import java.util.Scanner;

public class BankAccountManager {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
	private static final String USER = "root";
	private static final String PASS = "root";

	private Connection conn;
	private Statement stmt;

	/**
	 * Constructor to initialize the BankAccountManager.
	 */
	public BankAccountManager() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// open a new account
	public void openAccount(Scanner sc) {
		try {
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter initial balance: ");
			double balance = sc.nextDouble();

			if (balance < 100) {
				System.out.println("Initial balance should be at least 100. Account not opened.");
				return;
			}

			String sql = "INSERT INTO accounts (name, balance, opened_date) VALUES ('" + name + "', " + balance
					+ ", NOW())";
			stmt.executeUpdate(sql);

			System.out.println("Account opened successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modifyDetails(Scanner sc) {
		try {
			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			System.out.print("Enter new name: ");
			String name = sc.next();

			String sql = "UPDATE accounts SET name = '" + name + "' WHERE account_number = " + accountNumber;
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Details updated successfully.");
			} else {
				System.out.println("Account not found. Please check the account number.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void checkBalance(Scanner sc) {
		try {
			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			String sql = "SELECT balance FROM accounts WHERE account_number = " + accountNumber;
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				double balance = rs.getDouble("balance");
				System.out.println("Balance: " + balance);
			} else {
				System.out.println("Account not found. Please check the account number.");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deposit(Scanner sc) {
		try {
			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			System.out.print("Enter amount to deposit: ");
			double amount = sc.nextDouble();

			String sql = "UPDATE accounts SET balance = balance + " + amount + " WHERE account_number = "
					+ accountNumber;
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Amount deposited successfully.");
			} else {
				System.out.println("Account not found. Please check the account number.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void withdraw(Scanner sc) {
		try {
			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			System.out.print("Enter amount to withdraw: ");
			double amount = sc.nextDouble();

			String sql = "SELECT balance FROM accounts WHERE account_number = " + accountNumber;
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				double balance = rs.getDouble("balance");
				if (balance >= amount) {
					sql = "UPDATE accounts SET balance = balance - " + amount + " WHERE account_number = "
							+ accountNumber;
					int rowsAffected = stmt.executeUpdate(sql);
					if (rowsAffected > 0) {
						System.out.println("Amount withdrawn successfully.");
					} else {
						System.out.println("Withdrawal failed. Please try again.");
					}
				} else {
					System.out.println("Insufficient balance.");
				}
			} else {
				System.out.println("Account not found. Please check the account number.");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeAccount(Scanner sc) {
		try {
			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			String sql = "SELECT DATEDIFF(NOW(), opened_date) AS days FROM accounts WHERE account_number = "
					+ accountNumber;
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int days = rs.getInt("days");
				if (days < 60) {
					System.out.println("You are not allowed to close the account within 60 days of opening.");
					return;
				}
			} else {
				System.out.println("Account not found. Please check the account number.");
				return;
			}

			sql = "DELETE FROM accounts WHERE account_number = " + accountNumber;
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Account closed successfully.");
			} else {
				System.out.println("Account not found. Please check the account number.");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
