package com.testsuite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.testbase.TestBase;
import com.utilities.TestUtil;

public class DataProviderTest extends TestBase {
	@BeforeMethod
	public void init() {
		driver = getDriver("chrome");
		driver.get("https://ui.freecrm.com/");
	}
	@DataProvider
	public Iterator<Map<String, String>> getTestData() {
		ArrayList<Map<String,String>> allData= TestUtil.getDataFromExcel("RegistrationForm");

		return allData.iterator();
	}
	@Test(dataProvider="getTestData")
	public void SignUp(Iterator<Map<String, String>> lstData) {
		Map<String,String>data = lstData.next();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(data.get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(data.get("lname"));
		driver.findElement(By.name("reg_emailzz")).sendKeys(data.get("email"));
		driver.findElement(By.name("reg_passwd__")).sendKeys(data.get("password"));
		
		Select days = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		days.selectByVisibleText(data.get("day"));
		Select months = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		months.selectByVisibleText(data.get("mon"));
		Select years = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		years.selectByVisibleText(data.get("year"));
		
		
		driver.findElement(By.xpath("//label[text()='"+data.get("gender")+"']/following::input[@type='radio' and @name='sex']")).click();	driver.get("https://www.facebook.com/");
		
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
