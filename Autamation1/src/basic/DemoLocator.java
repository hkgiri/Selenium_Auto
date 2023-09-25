package basic;
//Example for Tag name Locator..
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/demo.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		driver.close();
	}
}
