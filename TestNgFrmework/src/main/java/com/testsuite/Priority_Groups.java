package com.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testbase.TestBase;

public class Priority_Groups extends TestBase{
	@BeforeMethod
	public void init() {
		driver = getDriver("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test(priority=1,groups="Regression")
	public void googleTitle() {
		
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
	}
	@Test(priority=4,groups = "Smoke")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=2,groups="Regression")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=3,groups="Smoke")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=5)
	public void test4() {
		System.out.println("prio");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
