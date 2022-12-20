package com.testng.basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics06_TestNG_InvocationCount {
	
	/**
	 * There is another keyword called invocationCount, that will help us to execute our test cases n number of times.
	 * If we set our invocationCount as 5 that particular test cases will be executed 5 times.
	 */
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser is launched");
	}
	
	@Test(invocationCount = 5)
	public void aTest() {
		System.out.println("A Test");
	}
	
	@Test(invocationCount = 3)
	public void bTest() {
		System.out.println("B Test");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Browser is closed");
	}

}
