package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to type abcd in T1 and T2 textbox alternatively character by character.
public class HandlingFrames2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(1000);
		driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(1000);
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(1000);
		driver.close();
	}


}
