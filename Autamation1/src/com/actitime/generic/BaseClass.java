package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass(groups={"regressiontest","smoketest"})
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass(groups={"regressiontest","smoketest"})
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.quit();;
	}
	@BeforeMethod(groups={"regressiontest","smoketest"})
	public void logIn() {
		Reporter.log("login",true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod(groups={"regressiontest","smoketest"})
	public void logOut() {
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
