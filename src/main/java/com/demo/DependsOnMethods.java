package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;		

//dependsOnMethods

public class DependsOnMethods {
	
	@Test
	public void loginTest()				//this will be passed
	{
		System.out.println("this is  loginTest");
		//successful log in can be checked by comparing String of Dashboard page with expected String of Dashboard page
		
	}

	
	@Test(dependsOnMethods="loginTest")				//this will be failed
	public void dashboardTest()
	{
		System.out.println("this is dashboardTest");
		Assert.assertEquals("hi", "hello");    //intentionally we are failing this test case
											   //Assert is a class
											   //Assert has many assertEquals();  overloaded methods												
	}
	
	
	@Test(dependsOnMethods="dashboardTest")			//this will be skipped since dashboardTest is failed
	public void userTest()
	{
		System.out.println("this is userTest");
	}
	


}
