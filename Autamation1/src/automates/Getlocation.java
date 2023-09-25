package automates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print X and Y axis of login button present in facebook.
public class Getlocation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.id("loginbutton"));
		int x = login.getLocation().getX();
		int y=login.getLocation().getY();
		System.out.println("X axis = "+x);
		System.out.println("Y axis = "+y);
	}
}
