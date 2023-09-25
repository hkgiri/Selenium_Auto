package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to navigate to google and type qspiders in search text box, capture all auto suggestion and print it on the console and select the last auto suggestion.
public class PrintALLAUtosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Qspiders");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		int count = allsugg.size();
		System.out.println(count);
		for (WebElement sugg : allsugg) {
			String text = sugg.getText();
			System.out.println(text);
		}
		for(int i=0;i<count;i++) {
			WebElement sugg = allsugg.get(i);
			if(i==count-1) {
			sugg.click();
			Thread.sleep(3000);
			}
		}
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys("Qspiders");
		List<WebElement> allsugg1 = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		for (int i = 0; i < count; i++) {
			WebElement sugg = allsugg1.get(i);
			if (i==count-2) {
				sugg.click();
				Thread.sleep(5000);
			}
			
		}
		driver.close();
	}
	
}
