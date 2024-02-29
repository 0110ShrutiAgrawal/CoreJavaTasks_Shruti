package com.jdbc.bank.AbcdBank;

import java.sql.*;

/**
 * @author 91959
 *
 */
public class BankAccountApp {
	public static void main(String[] args) {
		// Create an instance of the BankMenu class
		BankMenu menu = new BankMenu();
		// Display the menu
		menu.displayMenu();
	}
}
