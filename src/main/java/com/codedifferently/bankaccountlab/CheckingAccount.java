package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount {

    private String name;

    public CheckingAccount(int accountNumber, double fees, double balance, String password, String name) {
        super(accountNumber, fees, balance, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return accountNumber +" "+ fees +" "+ balance +" "+ password +" "+ name;
    }

}