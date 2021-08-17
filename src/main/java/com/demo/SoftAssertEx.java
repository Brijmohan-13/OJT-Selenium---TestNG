package com.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	//SoftAssert is used to execute the code written after Assert.assertequals("", "");  even if the test cases fails/exception occurrence
	
	
	@Test
	public void test01()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("0", "1");
		System.out.println("hii");
		
	}//method ends
	

}//class ends

//data provider provides data from excel/data written within class
//data provider must be used for data large data from excel and for small/medium data written in the class only