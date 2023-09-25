package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print the color the of forgot password link in facebook.
public class PrintColour {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String colour = driver.findElement(By.linkText("Forgotten account?")).getCssValue("color");
		System.out.println(colour);
		driver.close();
	}
}
