package com.testsuite;

import org.testng.annotations.Test;

public class DependancyTest {
	@Test
	public void loginTest() {
		System.out.println(9/0);
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("HomePageTest");
	}
	@Test
	public void dummyTest() {
		System.out.println("dummy Test with no dependancy");
	}
}
