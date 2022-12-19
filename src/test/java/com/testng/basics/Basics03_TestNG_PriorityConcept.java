package com.testng.basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics03_TestNG_PriorityConcept {
	
	/**
	 * NOTE : We can also set priority to our test cases, it will accept integer values.
	 * If we set the integer value to negative then it will be executed first.
	 * If both the tests having same priority then it will pick based on the alphabetical order.
	 * If we don't set any priority then the non priority test cases will be executed.
	 */
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser is opened");
	}
	
	@Test(priority = 4)
	public void aTest() {
		System.out.println(" A Test");
	}
	
	@Test(priority = 5)
	public void bTest() {
		System.out.println(" B Test");
	}
	
	@Test(priority = 2)
	public void cTest() {
		System.out.println(" C Test");
	}
	
	@Test(priority = 3)
	public void dTest() {
		System.out.println(" D Test");
	}
	
	@Test(priority = 1)
	public void eTest() {
		System.out.println(" E Test");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Browser is closed");
	}

}
