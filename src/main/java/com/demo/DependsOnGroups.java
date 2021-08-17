package com.demo;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnGroups {
	
	WebDriver driver;
			
	@Test(groups="login", priority=1)
	public void verifyTitle()				//test case on log in page
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");			//browser set
		driver=new ChromeDriver();													//browser launch
		driver.get("file:///C:/Users/Admin/Desktop/JBK/Selenium/Offline%20website/Offline%20website/Offline%20website/Offline%20website/index.html");		//url enter in browser
		Assert.assertEquals(driver.getTitle() , "JavaByKiran | Log in");
	}
	
	@Test(groups="login",	priority=2)
	public void validLogin()				//test case on log in page
	{
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	
	//above two test cases are grouped together using groups....and priority is applied over there
	//test cases of Dashboard page should be executed if all test cases of Login page are passed(i.e test cases of login group)
	//so we use dependsOnGroups for below test case
	
	
	//always run=true;        it will execute/run the test case anyway		(refer image)
	//default value of always run is false
	@Test(dependsOnGroups="login",	groups="dash"	,alwaysRun=true)						//test case on Dashboard page
	public void checkHeader()
	{
		WebElement header=driver.findElement(By.tagName("h1"));
		Assert.assertEquals( header.getText()  , "Dashboard");
	//	Assert.assertTrue(header.getText().contains("Dash"));         ....this can be also used 
	}
	
	@Test(dependsOnGroups={"login","dash"})			//test case on Dashboard page
													//groups can not be prioritized...here groups will get executed in the order we have written on line 47 
													//one test case can depend on multiple groups @ one test case can be in multiple groups
	public void verifyLogoutButton()
	
	{
		WebElement btn=driver.findElement(By.xpath("//a[text()='LOGOUT']")) ;
		btn.click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Log in");
	}
	
	//suppose if Downloads page is not developed yet or if there are so many defects in the web page then enabled=false is used
	//then the test case is not the part of execution
	@Test(dependsOnGroups="login"	, enabled=false)
	public void downloadPageTest(){
		Assert.assertEquals(5,4);
	}
	
	//EXECUTION SEQUENCE******
	//priority is checked first of all
	//then it goes for execution but if gets any dependsOnGroups/dependsOnMethods then execute respective groups
	//while executing groups it checks again priority of test cases with same groups...if all test cases of groups are passed then only test case which is dependent on this groups will get executed
	
	//groups are generally made based on type of test(groups name is also like below)
	//smoke---we will execute this test after we get automation build...& if it failed in smoke test then build gets rejected...if passed then further it is processed for regression,sanity,end to end
	//regression
	//sanity
	//end to end
	
	
}//class ends
//domination is as follow...alwaysRun parameter dominates all other parameters
//priority--->dependsOnMethods--->dependsOnGroups--->alwaysRun