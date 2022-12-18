package com.testng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics01_TestNG_OrderOfExecution {
	
	/**
	 * Features of Using TestNG
	 * We can easily write the test cases
	 * We can set priority to our test cases.
	 * We can ignore some test cases.
	 * We can do parallel execution.
	 * We can easily integrate with reports.
	 * We can define pre-conditions and post conditions
	 * We can do assertions(validations)
	 * NOTE : Every annotation must be written with a method. These annotations are used to control the flow of methods in test script.
	 * It's not mandatory to use all the annotations like BeforeSuite, BeforeTest and BeforeClass it's a flow we can use any one of them.
	 * IMPORTANT NOTE : Here BeforeMethod and AfterMethod will behave differently, BeforeMethod will execute before each and every tests and 
	 * AfterMethod will execute after each and every tests.
	 */
	
	@BeforeSuite
	public void bSuite() {
		System.out.println("Hey, I will be executed first");
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("Hey, I will be executed second");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Hey, I will be executed third");
	}
	
	@BeforeMethod
	public void bMeth() {
		System.out.println("Hey, I will be executed differently, BeforeMethod will be execute before each and every test methods");
	}
	
	@Test
	public void test1() {
		System.out.println("in test case 1");
	}
	
	@Test
	public void test2() {
		System.out.println("in test case 2");
	}
	
	@Test
	public void test3() {
		System.out.println("in test case 3");
	}
	
	@AfterMethod
	public void aMeth() {
		System.out.println("Hey, I will be executed after each and every tests");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("Hey, I will be executed after AfterMethod");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("Hey, I will be executed after AfterClass");
	}
	
	@AfterSuite
	public void aSuite() {
		System.out.println("Hey, I will be executed in the last");
	}

}
