package automates;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to close all the browser except the parent browser.
public class CloseTheBrowser1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		String parentW = driver.getWindowHandle();
		int size = allwh.size();
		System.out.println(size);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if (!wh.equals(parentW)) {
			driver.close();
			}
			
		}
	}
}
