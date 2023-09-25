package hemanth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		//WebElement link = driver.findElement(By.xpath("//a[text()='Celebrating the Big Mango']"));
		//Actions a=new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for (; ;)
		{
			try {
				WebElement link = driver.findElement(By.xpath("//a[text()='Celebrating the Big Mango']"));
				link.click();
				break;
				
			} catch (Exception e) {
				jse.executeScript("window.scrollBy(0,500)");
			}
		}
		
	}
}
