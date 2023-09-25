package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print the tagname of forgot your password link present in actitime.along with href attribute. 
public class Gettext_and_Getattribute_method {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement id = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		String pass = id.getText();
		String href = id.getAttribute("href");
		System.out.println(pass);
		System.out.println(href);
	}
}
