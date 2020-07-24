package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        String expectedString = expectedAccountNumber2 +" "+ expectedFees2 +" "+ expectedBalance2 +" "+ expectedPassword +" "+ expectedCompany + " " + expectedTaxId;
        //Then
        Assert.assertTrue(expectedString.equals(businessAccount.toString()));
    }
    @Test
    public void getAccountNumber2Test(){
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        int actualAccountNumber2 = businessAccount.getAccountNumber();
        //Then
        Assert.assertEquals(expectedAccountNumber2, actualAccountNumber2);
    }
    @Test
    public void getExpectedFees2Test() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        double actualFees2 = businessAccount.getFees();
        //Then
        Assert.assertEquals(expectedFees2, actualFees2, 0.0);
    }
    @Test
    public void getExpectedCompanyTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        String actualCompany = businessAccount.getCompany();
        //Then
        Assert.assertEquals(expectedCompany, actualCompany);
    }
    @Test
    public void getExpectedTaxIdTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        int actualTaxId = businessAccount.getTaxId();
        //Then
        Assert.assertEquals(expectedTaxId, actualTaxId);
    }
    @Test
    public void getExpectedBalance2Test() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        double actualBalance2 = businessAccount.getBalance();
        //Then
        Assert.assertEquals(expectedBalance2, actualBalance2, 0.0);
    }

    @Test
    public void setCompanyTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        businessAccount.setCompany("Code Differently");
        String expected = "Code Differently";
        String actual = businessAccount.getCompany();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTaxIdTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        businessAccount.setTaxId(20);
        int expected = 20;
        int actual = businessAccount.getTaxId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        businessAccount.depositInBalance(100);
        double expected = 200100;
        double actual = businessAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void withdrawTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        businessAccount.withdrawFromBalance(100);
        double expected = 199900;
        double actual = businessAccount.getBalance();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getPasswordTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        String expectedPassword = "Sajid";
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedBalance2, expectedPassword, expectedCompany, expectedTaxId);
        //When
        businessAccount.getPassword();
        String expected = "Sajid";
        String actual = businessAccount.getPassword();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
