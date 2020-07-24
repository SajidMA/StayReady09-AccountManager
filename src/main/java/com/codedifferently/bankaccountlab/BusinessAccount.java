package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount {

    private String company;
    private int taxId;

    public BusinessAccount(int accountNumber, double fees, double balance, String password, String company, int taxId) {
        super(accountNumber, fees, balance, password);
        this.company = company;
        this.taxId = taxId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return accountNumber +" "+ fees +" "+ balance +" "+ password +" "+ company + " " + taxId;
    }

}
