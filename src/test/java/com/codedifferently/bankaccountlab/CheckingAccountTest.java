package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        double expectedBalance = 100000.0;
        String expectedName = "Josh";
        String expectedPassword = "Sajid";

        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        String expectedString = expectedAccountNumber +" "+ expectedFees +" "+ expectedBalance +" "+ expectedPassword +" "+ expectedName;
        //Then
        Assert.assertTrue(expectedString.equals(checkingAccount.toString()));
    }
    @Test
    public void getAccountNumberTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        int actualAccountNumber = checkingAccount.getAccountNumber();
        //Then
        Assert.assertEquals(expectedAccountNumber, actualAccountNumber);
    }
    @Test
    public void getFeesTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.00;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        double actualFees = checkingAccount.getFees();
        //Then
        Assert.assertEquals(expectedFees, actualFees, 0.0);
    }
    @Test
    public void getNameTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        String actualName = checkingAccount.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getBalanceTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        double actualBalance = checkingAccount.getBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance, 0.0);
    }

    @Test
    public void depositTest() {
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        checkingAccount.depositInBalance(100);
        double expected = 100100;
        double actual = checkingAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void withdrawTest() {
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        checkingAccount.withdrawFromBalance(100);
        double expected = 99900;
        double actual = checkingAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getPasswordTest() {
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        checkingAccount.getPassword();
        String expected = "Sajid";
        String actual = checkingAccount.getPassword();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        String expectedPassword = "Sajid";
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedBalance, expectedPassword, expectedName);
        //When
        checkingAccount.setName("Cody");
        String expected = "Cody";
        String actual = checkingAccount.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
