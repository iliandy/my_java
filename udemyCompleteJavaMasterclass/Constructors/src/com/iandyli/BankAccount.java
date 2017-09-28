package com.iandyli;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private int acctNum;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNum;

    public int getAcctNum() {
        return this.acctNum;
    }
    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNum() {
        return this.customerPhoneNum;
    }
    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public void deposit(double amt) {
        this.balance += amt;
        System.out.println("Balance after deposit is " + this.balance + ".");
    }
    public void withdraw(double amt) {
        if (this.balance - amt > 0) {
            this.balance -= amt;
            System.out.println("Balance after withdraw is " + this.balance + ".");
        }
        else {
            System.out.println("Insufficient funds to make withdrawal. Balance is currently " + this.balance + ".");
        }
    }
}
