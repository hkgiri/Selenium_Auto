package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 write a script to navigate to cleartrip.com and then search for a flight
 available on 7th july 2023 from banglore to goa, capture time and flight name 
 and display it on the consol.
 */
public class PrintFlightNameorDetails {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		driver.findElement(By.xpath("(//div[text()='7'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
		
	}

}
