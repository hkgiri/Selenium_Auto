package automates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to check whether height and width of user and pwd textfield is equal or not present in actitime.
public class HeightANDWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		int unh = un.getSize().getHeight();
		int unw = un.getSize().getWidth();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int pwdh = pwd.getSize().getHeight();
		int pwdw = pwd.getSize().getWidth();
		if (unh==pwdh&&unw==pwdw) {
			System.out.println("username and password size is similar and pass");
		}
		else
			System.out.println("username and password size is not similar and fail");
		
	}
}
