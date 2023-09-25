package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to check whether username and password textbox are properly alignment or not present in actitime.
public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 int x1 = driver.findElement(By.id("username")).getLocation().getX();
		 int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		 if (x1==x2) {
			System.out.println("UN and PWD textbox are aligned properly and pass");
		}
		 else {
			 System.out.println("UN and PWD textbox are not aligned properly and fail");
		 }
		 driver.close();
	}
}
