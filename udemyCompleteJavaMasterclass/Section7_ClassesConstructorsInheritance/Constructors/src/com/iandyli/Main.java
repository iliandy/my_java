package com.iandyli;

public class Main {

    public static void main(String[] args) {
        // BankAccount assignment
        BankAccount myBankAcct = new BankAccount();
        myBankAcct.setBalance(1000);
        System.out.println("Balance is currently " + myBankAcct.getBalance());

        myBankAcct.deposit(150);
        myBankAcct.withdraw(1200);

        // VipCustomer assignment
        VipCustomer mo = new VipCustomer();
        System.out.println(String.format("VIP customer name: %s, credit limit: %.2f, email: %s.", mo.getName(), mo.getCreditLimit(), mo.getEmail()));

        VipCustomer bo = new VipCustomer("Bo", 8000.00);
        System.out.println(String.format("VIP customer name: %s, credit limit: %.2f, email: %s.", bo.getName(), bo.getCreditLimit(), bo.getEmail()));

        VipCustomer jo = new VipCustomer("Jo", 3000, "jo@jo.com");
        System.out.println(String.format("VIP customer name: %s, credit limit: %.2f, email: %s.", jo.getName(), jo.getCreditLimit(), jo.getEmail()));

    }
}
