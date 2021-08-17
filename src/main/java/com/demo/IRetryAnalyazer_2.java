package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetryAnalyazer_2 {

	
	@Test(priority=1)
	public void test01()
	{
		Assert.assertEquals(1, 2);
		System.out.println("hi");
	}
	
	@Test(priority=2)
	public void test02()
	{
		Assert.assertEquals(2, 2);
		System.out.println("hello");
	}

	
}
