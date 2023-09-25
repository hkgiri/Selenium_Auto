package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDriver {
	@Test
	public void validlogin() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1","manager1");
		Thread.sleep(4000);
		l.setLogin("admin","manager");
	}
}
