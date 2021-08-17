package com.demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//implementing class 1
public class IRetryAnalyazer_ implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int maxCount=5;
		int count=1;
		
		if(count<=maxCount)
		{	count ++;
			return true;	}
		
		return false;
	}

	//IRetryAnalyzer-Interface is used to run the failed test cases again and again for the given number of times
	//this interface has retry()
	//maxCount is 5,count is 1...means failed test case will get executed 5 times
	
	
	
	
	
}
