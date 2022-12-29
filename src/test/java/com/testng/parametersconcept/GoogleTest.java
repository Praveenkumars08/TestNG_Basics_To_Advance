package com.testng.parametersconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@Test(priority = 2)
	public void googleTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

}
