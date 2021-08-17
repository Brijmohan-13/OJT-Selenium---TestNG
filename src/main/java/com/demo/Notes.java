package com.demo;

public class Notes {
	
/*	TestNg is also called as TDD-test driven development
	It is Automation test cases scripting tool
	
	TestNG Annotations
	@BeforeSuite
	@BeforeClass
	@BeforeMethod
	@BeforeTest
	@BeforeGroups
	@Test						//this is for test case---it is written before Method
	@DataProvider
	@AfterSuite
	@AfterClass
	@AfterMethod
	@AfterTest
	@AfterGroups
	
	
	//testng.xml is used to run multiple classes and multiple test cases in parallel/simultaneous
	//to create testng.xml---right click on class having @Test annotation---TestNG---convert to TestNG
	//to run this testng.xml ----right click on test.xml file---run as TestNG Suite
	
	//we can write only one suite in one testng.xml
	//one project can have multiple testng.xml files
	//to run multiple testng.xml files we use pom.xml	(refer surefire plugin code written in pom.xml)
	//following things re written in testng.xml file
			multiple classes (which are to be run simultaneously)
			Listeners
			include groups, exclude groups in
			
	 
	  Parameters/arguments of test case (for controlling the test cases)
	  priority
	  dependsOnMethods
	  dependsOnGroups.....groups
	  alwaysRun
	  enabled=false    enabled=true
	  
	  include groups ,exclude groups in test.xml
	  invocationCount
	  IRetryAnalyzer
	  parallel,thread-count
	  
	  @Parameters
	  
	  
	  @Test has method, which has return type void always
	  Assert.assertEquals(actual, expected);   is written always only at end of test case
	  one test case has only one Assert.assertEquals(actual , expected);
	  
	  groupid--com.banking
	  artifactid--com.icici	(project name)
	  
*/
}
