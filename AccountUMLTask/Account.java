package com.hughes.AccountUMLTask;
import java.util.UUID;

/**
 * @author 91959
 *
 */
public class Account {
    private String accountId;
    private String accountName;
    private String address;
    private double currentBalance;

    public Account(String accountName, String address, double initialDeposit) {
        // Generate a unique account ID
        this.accountId = generateAccountId();
        this.accountName = accountName;
        this.address = address;
        this.currentBalance = initialDeposit;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public double currentBalance() {
        return currentBalance;
    }

    public void showDetails() {
        // Display account details
        System.out.println("Account ID is as follows: " + accountId);
        System.out.println("Account Name is as follows:: " + accountName);
        System.out.println("Address is as follows: " + address);
        System.out.println("Current Balance is as follows: " + currentBalance);
    }

    public String getDetails() {
        // Return account details as a string
        return "Account ID: " + accountId + "\nAccount Name: " + accountName + "\nAddress: " + address + "\nDeposit Amount: " + currentBalance;
    }

    public void updateBalance(double amount) {
        // Update the account balance
        currentBalance = currentBalance + amount;
    }

    private String generateAccountId() {
        // Generate a random UUID and return the first 8 characters
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
