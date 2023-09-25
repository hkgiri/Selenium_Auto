package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPUP2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();//open the browser.
		driver.get("https://demo.automationtesting.in/Alerts.html");//enter the url.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Wait Condition.
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();//click on 'Alert with Textbox'. 
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();//click on 'demonstrate the prompt box'.
		Alert a = driver.switchTo().alert();//call the swithTo() and alert() then save in Alert class.
		a.sendKeys("my name is Hemant Giri");//send the 'value'.
		a.accept();//click on 'OK' button.
		String text = driver.findElement(By.id("demo1")).getText();//check whether value is print in page or not.
		if (text.equalsIgnoreCase("Hello my name is Hemant Giri How are you today")) {
			System.out.println(text+" it is pass ");
		}
		else {
			System.out.println(text+" it is fail ");
		}
		driver.close();
	}
}
