package com.iandyli;

public class Main {

    public static void main(String[] args) {
        BankAccount myBankAcct = new BankAccount();
        myBankAcct.setBalance(1000);
        System.out.println("Balance is currently " + myBankAcct.getBalance());

        myBankAcct.deposit(150);
        myBankAcct.withdraw(1200);
    }
}
