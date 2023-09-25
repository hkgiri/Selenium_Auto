package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print HTML source code of the webpage.
public class PrintHTMLcode {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);
		driver.close();
	}
}
