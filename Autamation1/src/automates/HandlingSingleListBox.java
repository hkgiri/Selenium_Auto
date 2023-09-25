package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// open the browser.
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");//enter the url.
		driver.findElement(By.linkText("Sign up for Facebook")).click();//click the sign up link. 
		Thread.sleep(3000);
		WebElement monthlist = driver.findElement(By.id("month"));// find the month dropdown button.
		Select s=new Select(monthlist);//create a select object.
		Thread.sleep(3000);
		s.selectByIndex(11);//assign the index of the month
		Thread.sleep(3000);
		s.selectByValue("2");//assign the value of the month
		Thread.sleep(3000);
		s.selectByVisibleText("Sep");//assign the visible text of the month. 
	}
}
