package com.hughes.AccountUMLTask;

/**
 * @author 91959
 *
 */
public class Main {
    public static void main(String[] args) {
    	
        // Create an array of 10 different accounts
        Account[] accounts = new Account[10];
        accounts[0] = new Account("Shruti", "Gurugram", 1000.0); // Create the first account
        accounts[1] = new Account("Shruti Agrawal", "Sector-46", 2000.0); // Create the second account
        // Add more accounts...

        accounts[0].showDetails(); // Display details of the first account

        // Perform transactions on the first account
        Transaction transaction = new Transaction(accounts[0]);
        transaction.depositAmount(500.0); // Deposit 500.0 into the first account
        transaction.withdrawAmount(200.0); // Withdraw 200.0 from the first account

        // Create a loan for the second account
        Loan loan = new Loan(accounts[1], "home", 1000.0);

        // Perform a loan transaction on the second account
        Transaction loanTransaction = new Transaction(accounts[1]);
        loanTransaction.payLoan(300.0, "home", 1000.0); // Pay 300.0 towards the home loan for the second account

        // Display account details after transactions
        accounts[0].showDetails(); // Display details of the first account
    }
}
