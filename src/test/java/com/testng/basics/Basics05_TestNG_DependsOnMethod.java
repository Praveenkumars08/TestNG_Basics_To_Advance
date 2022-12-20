package com.testng.basics;

import org.testng.annotations.Test;

public class Basics05_TestNG_DependsOnMethod {
	
	/**
	 * dependsOnMethods is a keyword used in testng when one method is dependent on another. If that method itself failed then the
	 * remaining methods will be skipped. According to unit testing it's not a good practice to use dependsOnMethods. A method should be
	 * independent it will impact test/execution coverage.
	 */
	
	@Test()
	public void insertCard() {
		System.out.println("Card has been inserted");
		//int i = 9/0; --> Here exception will be thrown and test case will be failed and the following test cases will be skipped.
	}
	
	@Test(dependsOnMethods = "insertCard")
	public void selectLanguage() {
		System.out.println("Please select language of your choice");
	}
	
	@Test(dependsOnMethods = "selectLanguage")
	public void typePin() {
		System.out.println("Please enter your PIN");
	}
	
	@Test(dependsOnMethods = "typePin")
	public void selectAcct() {
		System.out.println("Please select the account of your choice");
	}
	
	@Test(dependsOnMethods = "selectAcct")
	public void enterRespectiveAmountToWithDraw() {
		System.out.println("Please enter the amount to withdraw");
	}
	
	@Test(dependsOnMethods = "enterRespectiveAmountToWithDraw")
	public void removeCard() {
		System.out.println("Remove the card and wait for cash");
	}

}
