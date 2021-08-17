package com.demo;

import org.testng.annotations.Test;

public class InvocationCount {

	//invocationCount is used to execute the same test case for given number of times
	
	@Test(invocationCount=5)					//on console also, Passed will 5 times
	public void login()
	{
		System.out.println("loginTest");		
	}
	
}//class ends
