package com.testng.parametersconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SnapDealTest extends BaseTest{
	
	@Test(priority = 3)
	public void snapDealTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items");
	}

}
