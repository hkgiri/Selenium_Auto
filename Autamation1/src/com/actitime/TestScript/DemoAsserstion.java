package com.actitime.TestScript;
//this method is testcase is failed then Execution is brea
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DemoAsserstion {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "Soogle";
		org.testng.Assert.assertEquals(aTitle, eTitle);
		driver.close();
		
	}
}
