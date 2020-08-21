package com.testsuite;

import org.testng.annotations.Test;

public class InvocationTest {
	//execution will not continue for this specific test as soon as its hit exception but doesnt throw its
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void test() {
	 int a[] = {1,2,3};
	 System.out.println(a[3]); //array out of bound here
	 System.out.println("hi");
	 
	 String str= "100x";
	 
	int b= Integer.parseInt(str);
	 
	 System.out.println(b);
	}
}
