package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demo()
	{
		System.out.println("hi");//print only console
		Reporter.log("Welcom to TestNG",true);//print console and report
		Reporter.log("Bye",false);//print only report
		Reporter.log("hello");//print only report
	}
}
