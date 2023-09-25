package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Script of Explain StaleElementReffrence Exception.
public class DemoPOM {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//Stores the username textbox address as @a1 in untbx
		WebElement untbx = driver.findElement(By.id("username"));
		//refresh and username textbox get new address like @p1.
		driver.navigate().refresh();
		//try to enter admin using old address i.e @a1.
		untbx.sendKeys("admin");
		
	}
}
