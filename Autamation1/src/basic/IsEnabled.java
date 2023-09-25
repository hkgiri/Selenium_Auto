package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to check whether login button is present in Facebook is Enabled or not.
public class IsEnabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		boolean login = driver.findElement(By.name("login")).isEnabled();
		System.out.println(login);
		if (login==true) {
			System.out.println("Login Button is Enabled");
		}
		else {
			System.out.println("Login Button is Disabled");
		}
	}
}
