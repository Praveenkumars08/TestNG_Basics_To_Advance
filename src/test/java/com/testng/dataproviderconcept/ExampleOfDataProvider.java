package com.testng.dataproviderconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleOfDataProvider {
	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
	}
	@DataProvider
	public Object loginData() {
		return new Object[][] {
			{"test@gmail", "1234"},
			{"gmail.com","3213"},
			{"tom@gmail.com","3434343"},
			{"tbh@gmail","134323"},

		};
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String uName, String pwd) {
		boolean flag = doLogin(uName, pwd);
		Assert.assertEquals(flag, true);
	}


	public boolean doLogin(String uName, String pwd) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(uName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String txt = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		if(txt.contains("No match")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
