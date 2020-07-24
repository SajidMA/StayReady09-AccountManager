package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    protected int accountNumber;
    protected double fees;
    protected double balance;
    protected String password;

    public BankAccount(int accountNumber, double fees, double balance, String password) {
        this.accountNumber = accountNumber;
        this.setFees(fees);
        this.balance = balance;
        this.setPassword(password);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getBalance() {
        return balance;
    }

    public void depositInBalance(double balance) {
        this.balance += balance;
    }

    public void withdrawFromBalance(double balance) {
        this.balance -= balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", fees=" + fees +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }

}
