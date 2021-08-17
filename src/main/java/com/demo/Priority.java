package com.demo;

import org.testng.annotations.Test;			//TestNG is a Library

//priority is used to prioritize the test cases
//default value of priority is 0
//priority can be negative also
//Execution sequence------>		-3	-2  -1	 0	 1	 2	 3
//default execution sequence if priority is not mentioned is Alphabetically
//if there are same priorities then execution sequence is Alphabetically

//we can not write Test case with same name & having same parameters
//we can write Test case with same name if it has different parameters

public class Priority {
	
	@Test(priority=1)
	public void test01()
	{
		System.out.println("hi");
	}

	@Test
	public void test02()
	{
		System.out.println("hello");
	}
	
	@Test(priority=-1)
	public void test03()
	{
		System.out.println("bye");
	}
	
	@Test(priority=5)			//same priority
	public void test04()
	{
		System.out.println("hello JBK");
	}
	
	@Test(priority=5)			//same priority
	public void test05()
	{
		System.out.println("hello java");
	}
	
	
	
	//Tests run on console means passed + failed + skipped
	//if a test case is run then it it either passed or failed
	//if @Test is written then we do not require main method to run program

}
