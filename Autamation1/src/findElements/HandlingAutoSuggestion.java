package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Automation The Following Scenario.
 1-Open the browser.
 2-Go to Google.com.
 3-Type 'java' in search textbox.
 4-Find all the auto suggestion and print the count of Auto suggestion.
 5-print the text of Auto suggestion. 
 6-select the first auto suggestion.  
*/
public class HandlingAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open the browser.
		WebDriver driver=new ChromeDriver();
		//enter url.
		driver.get("https://www.google.com/");
		//type java in search textbox.
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		//find all the automation and print the count.
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsugg.size();
		System.out.println(count);
		//print the text of Automation.
		for (int i = 0; i < count; i++) {
		String text = allsugg.get(i).getText();	
		System.out.println(text);
		}
		driver.close();
	}
}
