package com.testng.basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics02_TestNGTests_OrderOfExecution {
	
	/**
	 * Test cases will be executed based on the method names(alphabetical order)
	 */
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser is opened");
	}
	
	@Test
	public void aTest() {
		System.out.println(" A Test");
	}
	
	@Test
	public void bTest() {
		System.out.println(" A Test");
	}
	
	@Test
	public void cTest() {
		System.out.println(" A Test");
	}
	
	@Test
	public void dTest() {
		System.out.println(" A Test");
	}
	
	@Test
	public void eTest() {
		System.out.println(" A Test");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Browser is closed");
	}

}
