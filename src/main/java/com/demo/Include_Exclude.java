package com.demo;

import org.testng.annotations.Test;

public class Include_Exclude {
	
	@Test(groups="login")
	public void checkTitle()
	{
		System.out.println("login1");
	}
		
	@Test(groups="login")
	public void validLogin()
	{
		System.out.println("login2");
	}

	@Test(groups="dash")
	public void chechHeader()
	{
		System.out.println("dash");
	}
	
	@Test(groups="users")
	public void chechDeleteButton()
	{
		System.out.println("users");
	}
		
	@Test(groups={"login","users"})		//one test case can depend on multiple groups @ one test case can be in multiple groups		
	public void test02()
	{
		System.out.println("both groups login and users");
	}
	
	@Test(groups={"login","dash"})		//one test case can depend on multiple groups @ one test case can be in multiple groups		
	public void test03()
	{
		System.out.println("both groups login and dash");
	}
	
	//with include tag, only included groups' test cases are executed
	//with exclude tag,	only excluded groups' test cases are not executed remaining are executed
	//include,exclude tags can be used in same test.xml file at a time
	//include and exclude can be used as per requirement.....if very few test case groups are to be run then we use include..if large number of test case groups are to be executed then we use exclude
	//if a test case is present in both include and exclude...then exclude has more importance means this test case won't get executed
	//include exclude is ignored if test case dependsOnGroups
	
}//class ends