package com.hughes.AccountUMLTask;
import java.util.UUID;

/**
 * @author 91959
 *
 */

public class Loan extends Account {
    private String loanId;
    private String loanType;
    private double loanAmount;

    public Loan(Account account, String loanType, double loanAmount) {
        // Call the constructor of the Account class to initialize account details
        super(account.getAccountName(), account.getAddress(), account.currentBalance());
        // Generate a unique loan ID
        this.loanId = generateLoanId();
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public String getLoanId() {
        return loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void showLoanDetails() {
        // Display loan details
        System.out.println("Loan ID is as follows: " + loanId);
        System.out.println("Loan Type is as follows: " + loanType);
        System.out.println("Loan Amount is as follows: " + loanAmount);
        // Call the showDetails method of the Account class to display account details
        super.showDetails();
    }

    private String generateLoanId() {
        // Generate a random UUID and return the first 8 characters
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
