package automates;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to only specific browser.
public class CloseTheBrowser2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		String parentW = driver.getWindowHandle();
		String expecttitle="Apple";
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String actualtitle = driver.getTitle();
			if (actualtitle.contains(expecttitle)) {
				driver.close();
			}
	}
}
}
