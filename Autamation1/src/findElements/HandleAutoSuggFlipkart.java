package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Automate the following scenario.
   1-open the browser.
   2-go to flipkart.
   3-type 'i phone' in the search textbox.
   4-capture all the auto suggestion and print the count of the auto suggestion.
   5-print the text of all auto suggestion.
   6-click on last auto suggestion. 
 */
public class HandleAutoSuggFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser.
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.flipkart.com/");
		////type i phone on searchtextbox.
		
		driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//li"));
		int count = allsugg.size();
		System.out.println(count);
		
		for (WebElement web : allsugg) {
			String text = web.getText();
			System.out.println(text);
		}
		/*for (int i = 0; i < count; i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
			
		}*/
		allsugg.get(count-2).click();
		Thread.sleep(2000);
		driver.close();
	}
}
