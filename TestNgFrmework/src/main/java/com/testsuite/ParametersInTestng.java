package com.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testbase.TestBase;

public class ParametersInTestng extends TestBase{
	@BeforeMethod
	@Parameters({"browser","url"})
	public void init(String brName, String url) {
		driver = getDriver(brName);
		driver.get(url);
	}
	
	@Test
	@Parameters({"email","password"})
	public void LoginApp( String emailId, String pwd) throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		//span[text()='Log In']
		driver.findElement(By.name("email")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
