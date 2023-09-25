package findElements;

import java.util.List;
import java.util.Scanner;

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
public class HandlingAutoSuggestion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open the browser.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Url of google");
		String url=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		//enter url by user.
		driver.get(url);
		//type java in search textbox.
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		//find all the automation and print the count.
		List<WebElement> allsugg = driver.findElements(By.xpath("//li"));
		int count = allsugg.size();
		System.out.println(count);
		//print the text of Automation.
		for (WebElement web : allsugg) {
			String text = web.getText();
			System.out.println(text);
		}
		//select the first auto suggestion.
		Thread.sleep(2000);
		allsugg.get(0).click();
		Thread.sleep(3000);
		//close the browser.
		driver.close();
	}
}
