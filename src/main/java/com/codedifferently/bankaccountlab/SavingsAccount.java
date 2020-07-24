package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount {

    private String name;
    private double rate;

    public SavingsAccount(int accountNumber, double fees, double balance, String password, String name, double rate) {
        super(accountNumber, fees, balance, password);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return accountNumber +" "+ fees +" "+ balance +" "+ password +" "+ name + " " + rate;
    }

}
