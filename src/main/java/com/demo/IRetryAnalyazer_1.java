package com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;

//implementing class 2
public class IRetryAnalyazer_1 implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(IRetryAnalyazer_.class);		///******
	}
}

//IAnnotationTransformer is used to set the IRetryAnalyzer
//IAnnotationTransformer can not be written over the class name....@Listerners(   .class)
//IAnnotationTransformer listener is to be mentioned in testng.xml file
//only ITestListener can be written over the class name

//Difference Between invocationCount and IRetryAnalyzer**********
//invocationCount is used to run/execute the same test case for given number of times
//IRetryAnalyzer will run/execute only failed test cases for given number of times

//How failed test cases are retried inTestNG ?*************
//there are two approaches----
//approach 1---explain with 2 implementing class
//approach 2---run failed.xml (see image)
