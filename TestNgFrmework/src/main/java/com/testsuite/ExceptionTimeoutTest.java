package com.testsuite;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	//dont write this kind of code
	@Test(invocationTimeOut=1000)
	public void infiniteLoopTest() {
		int i =1;
		while(i==1) {
			System.out.println(i);
		}
	}
}
