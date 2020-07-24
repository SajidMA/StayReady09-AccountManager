package com.codedifferently.bankaccountlab;

import java.util.Scanner;

public class MainApplication {

    Scanner in = new Scanner(System.in);
    int expectedAccountNumber = 3696;
    double expectedFees = 12.0;
    String expectedName = "Josh";
    double expectedBalance = 100000.0;
    String expectedPassword = "Sajid";
    CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);

    int expectedAccountNumber2 = 4753;
    double expectedFees2 = 12.0;
    String expectedCompany = "JP Morgan Chase";
    int expectedTaxId = 10;
    double expectedBalance2 = 200000.0;
    String expectedPassword2 = "Sajid";
    BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword2, expectedCompany, expectedTaxId);

    int expectedAccountNumber3 = 6390;
    double expectedFees3 = 12.0;
    String expectedName2 = "Josh";
    double expectedRates = 8.0;
    double expectedBalance3 = 300000.0;
    String expectedPassword3 = "Sajid";
    SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword3, expectedName2, expectedRates);

}
