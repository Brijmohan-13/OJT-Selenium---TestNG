package com.demo;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void test01()			//this is test case/method
	{
		System.out.println("hi");
	}

	
	
	//parallel in testng03.xml is used to run/execute test/classes/methods parallel/simultaneously in order to save time
	//thread-count is the maximum capacity of test/classes/methods that can run at a time
	//thread-count is used to define how many test/classes/methods can be run parallel at a time
	//if there are 8 classes and thread count is 5 then 5 classes will run in first slot and remaining 3 will get executed in second slot
	//sequence of execution of classes/methods/tests is in the order in which we write
	
	//classes,methods,test can be run parallel in test03.xml
	//test tag in testng03.xml is a module level thing
	//test tag contains classes tags
	
	//suite tag contains test tag
	//test tag contains classes tag
	//classes tag contains class
	
	//suite tag contains listeners tag
	//listeners tag contains listener
	
	//there will be only one suite in entire project 
		
	//general sequence
	//BeforeSuite
	//BeforeTest
	//BeforeClass
	//@BeforeMethos
}
