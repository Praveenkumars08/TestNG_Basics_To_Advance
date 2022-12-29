package com.testng.parametersconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest{
	
	@Test(priority = 1)
	public void flipkartTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	/*
	 * Assert is a class in testng, assertEquals is a method where we need to pass
	 * the actual and the expected value, if both the values are same the test will pass or else it will fail.
	 */

}
