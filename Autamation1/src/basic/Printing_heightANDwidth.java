package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print height and width of login button present in facebook.
public class Printing_heightANDwidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.id("loginbutton"));
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		driver.quit();
	}
}
