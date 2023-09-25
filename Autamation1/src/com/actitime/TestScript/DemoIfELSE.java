package com.actitime.TestScript;
// in this program is condition is failed but testcase or testscript are not failed because are you using if and else statement.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoIfELSE {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "Soogle";
		if (aTitle.equals(eTitle)) {
			Reporter.log("Title is matching and pass ",true);
		}
		else {
			Reporter.log("Title is not matching and fail ",true);
		}
		driver.close();
	}
}
