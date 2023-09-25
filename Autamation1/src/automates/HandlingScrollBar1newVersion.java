package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//write a script to scroll 3000pxl. vertically in bbc.com. using latest version and using Actions class. 
public class HandlingScrollBar1newVersion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		//WebElement target = driver.findElement(By.xpath("//span[text()='Future Planet']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		//a.scrollToElement(target).perform();
		a.scrollByAmount(0,3000).perform();
		driver.close();
	}

}
