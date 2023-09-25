package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to navigate to flipkart and search iphone 14 pro max and print all the iphone product name along with phone price in below format.
// mobile name --> mobile price
public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		List<WebElement> allname = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
		List<WebElement> allmob = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]/../../div[2]//div[1]/div[1]/div[1]"));
		for(int i=0;i<allname.size();i++)
		{
			String name = allname.get(i).getText();
			String mob = allmob.get(i).getText();
			System.out.println(name+"-->"+mob);
		}
		driver.close();
		
	}
	
}
