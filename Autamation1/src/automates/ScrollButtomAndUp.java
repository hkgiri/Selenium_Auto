package automates;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to scroll to buttom and up of the webpage in bbc.com. 
public class ScrollButtomAndUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//scroll to buttom of the webpage.
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//sroll to up of the webpage.
		j.executeScript("window.scrollTo(0,0)");
	}
}
