package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
	//@Parameters is used to state which browser is to be used
	//ChromeDriver
	//FirefoxDriver
	//EdgeDriver   (Microsoft edge)
	//InternetExplorer
	
	WebDriver driver;
		
	@Parameters("browser")
	@Test
	public void logInPageTitleCheck(String browser)
	{
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();}

		if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();}
		
		driver.get("file:///C:/Users/Admin/Desktop/JBK/Selenium/Offline%20website/Offline%20website/Offline%20website/Offline%20website/index.html");
		Assert.assertEquals(driver.getTitle() , "JavaByKiran | Log in");
	}
}
//SIT-system integration test has another url for same web application
//UAT-user acceptance test has another url for same web application

//chrome and firefox are environments/modes
//single/multiple browser values can be passed through test.xml
//in this example multiple, browers are running at a time using parallel and thread-count
//in test.xml parameters (chrome,firefox) are passed for cross browser testing

//remote webdriver is parent of chromedriver,firefoxdriver etc