package com.actitime.TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle="soogle";
		String aTitle=driver.getTitle();
		
		SoftAssert s=new SoftAssert();
	
		s.assertEquals(aTitle,eTitle);
		driver.close();
		
		
		
		
	}
	
	

}
