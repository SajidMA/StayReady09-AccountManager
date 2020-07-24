package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        String expectedString = expectedAccountNumber3 +" "+ expectedFees3 +" "+ expectedBalance3 +" "+ expectedPassword +" "+ expectedName2 + " " + expectedRates;
        //Then
        Assert.assertTrue(expectedString.equals(savingsAccount.toString()));
    }
    @Test
    public void getAccountNumber3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        int actualAccountNumber3 = savingsAccount.getAccountNumber();
        //Then
        Assert.assertEquals(expectedAccountNumber3, actualAccountNumber3);
    }
    @Test
    public void getFees3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        double actualFees3 = savingsAccount.getFees();
        //Then
        Assert.assertEquals(expectedFees3, actualFees3, 0.0);
    }
    @Test
    public void getName2Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        String actualName2 = savingsAccount.getName();
        //Then
        Assert.assertEquals(expectedName2, actualName2);
    }
    @Test
    public void getRatesTest(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        double actualRates = savingsAccount.getRate();
        //Then
        Assert.assertEquals(expectedRates, actualRates, 0.0);
    }
    @Test
    public void getBalance3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        double actualBalance3 = savingsAccount.getBalance();
        //Then
        Assert.assertEquals(expectedBalance3, actualBalance3, 0.0);
    }

    @Test
    public void depositTest() {
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        savingsAccount.depositInBalance(100);
        double expected = 300100;
        double actual = savingsAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void withdrawTest() {
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        savingsAccount.withdrawFromBalance(100);
        double expected = 299900;
        double actual = savingsAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getPasswordTest() {
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        savingsAccount.getPassword();
        String expected = "Sajid";
        String actual = savingsAccount.getPassword();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        savingsAccount.setName("Cody");
        String expected = "Cody";
        String actual = savingsAccount.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRateTest() {
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        String expectedPassword = "Sajid";
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedBalance3, expectedPassword, expectedName2, expectedRates);
        //When
        savingsAccount.setRate(16.0);
        double expected = 16.0;
        double actual = savingsAccount.getRate();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

}
