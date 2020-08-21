package com.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testbase.TestBase;

public class AssertionTest extends TestBase{
	@BeforeMethod
	public void init() {
		driver = getDriver("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void googleTitle() {
		
		String strTitle = driver.getTitle();
		Assert.assertEquals("Google", strTitle);
		
		boolean b = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(b);
		
		Assert.assertEquals(b, true);
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
