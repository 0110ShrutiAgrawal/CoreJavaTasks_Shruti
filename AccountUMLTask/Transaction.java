package com.hughes.AccountUMLTask;

/**
 * @author 91959
 *
 */
public class Transaction extends Loan {
    private double amount;
    private Account account;

    public Transaction(Account account) {
        // Call the constructor of the Loan class with empty loanType and 0 loanAmount for regular transactions
        super(account, "", 0);
        this.account = account;
        this.amount = 0; // Initialize amount to 0
    }

    public void depositAmount(double deposit) {
        if (deposit > 0) {
            account.updateBalance(deposit); // Update the account balance with the deposit amount
            amount += deposit; // Add the deposit amount to the total transaction amount
            System.out.println("Deposited amount is as follows:: " + deposit);
        } else {
            System.out.println("Invalid deposit amount please try again");
        }
    }

    public void withdrawAmount(double withdrawal) {
        if (withdrawal > 0 && withdrawal <= currentBalance()) {
            account.updateBalance(-withdrawal); // Deduct the withdrawal amount from the account balance
            amount -= withdrawal; // Deduct the withdrawal amount from the total transaction amount
            System.out.println("Withdrawn is as follows: " + withdrawal);
        } else {
            System.out.println("Invalid withdrawal amount is as follows:");
        }
    }

    public void payLoan(double payment, String loanType, double loanAmount) {
        if (payment > 0 && payment <= loanAmount) {
            loanAmount -= payment; // Deduct the payment from the loan amount
            amount -= payment; // Deduct the payment from the total transaction amount
            System.out.println("Loan Payment is as follows: " + payment);
        } else {
            System.out.println("Invalid payment amount please try again");
        }
    }

    public void showAccountDetails() {
        System.out.println("Account Details is as follows:");
        showLoanDetails(); // Display the loan details
        System.out.println("Transaction Amount is as follows: " + amount); // Display the total transaction amount
    }
}
