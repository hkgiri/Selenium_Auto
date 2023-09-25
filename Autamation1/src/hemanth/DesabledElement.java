package hemanth;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesabledElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Disabled.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('d2').value='manager'");

	}
}
