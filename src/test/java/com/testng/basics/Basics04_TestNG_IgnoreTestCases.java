package com.testng.basics;

import org.testng.annotations.Test;

public class Basics04_TestNG_IgnoreTestCases {
	
	/**
	 * At the test level, if we mentioned enabled=false that particular case won't be executed.
	 * We can also set the description of the test cases by using the description keyword as mentioned below.
	 */
	
	@Test(enabled = false)
	public void a1Test() {
		System.out.println("A1 test");
	}
	
	@Test(description = "This is A2 Test")
	public void a2Test() {
		System.out.println("A2 test");
	}
	
	@Test(enabled = false)
	public void a3Test() {
		System.out.println("A3 test");
	}
	
	@Test(description = "This is A3 Test")
	public void a4Test() {
		System.out.println("A4 test");
	}

}
