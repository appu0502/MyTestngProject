package com.testsuite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testbase.TestBase;

public class VerboseTest extends TestBase{
	//verbose in testng makes the report bit more readable and with more details
	//verbose value can be upto 10
	@BeforeMethod
	public void init() {
		driver = getDriver("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void googleTitle() {
		
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Google");
	}
	
	@Test
	public void VerifySearchText() {
		
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Google");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
