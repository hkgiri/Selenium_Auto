package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;

//write a script to check whether login page is loaded within 7 second or not..
public class TimeOutpage {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded in 7 second and pass");
		}
		catch(org.openqa.selenium.TimeoutException e) {
			System.out.println("page is not loaded within 7 second and fail");
		}
		driver.close();
	}
	
}
