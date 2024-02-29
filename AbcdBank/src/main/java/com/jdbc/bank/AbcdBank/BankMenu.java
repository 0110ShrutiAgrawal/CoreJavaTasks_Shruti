package com.jdbc.bank.AbcdBank;

import java.util.Scanner;

/**
 * Represents the menu for the ABCD Bank application.
 */
/**
 * @author 91959
 *
 */
public class BankMenu {
	private BankAccountManager accountManager;

	/**
	 * Constructor to initialize the BankMenu.
	 */
	public BankMenu() {
		this.accountManager = new BankAccountManager();
	}

	/**
	 * Displays the main menu and handles user input.
	 */
	public void displayMenu() {
		boolean exit = false;
		while (!exit) {
			// Display the menu options
			System.out.println("Greetings from XYZ Bank. Please make a selection:");
			System.out.println("1. Create a new account");
			System.out.println("2. Update personal information");
			System.out.println("3. View account balance");
			System.out.println("4. Make a deposit");
			System.out.println("5. Perform a withdrawal");
			System.out.println("6. Close an account");
			System.out.println("7. Exit the application");

			// Get user choice
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			// Perform actions based on user choice
			switch (choice) {
			case 1:
				accountManager.openAccount(sc);
				break;
			case 2:
				accountManager.modifyDetails(sc);
				break;
			case 3:
				accountManager.checkBalance(sc);
				break;
			case 4:
				accountManager.deposit(sc);
				break;
			case 5:
				accountManager.withdraw(sc);
				break;
			case 6:
				accountManager.closeAccount(sc);
				break;
			case 7:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
