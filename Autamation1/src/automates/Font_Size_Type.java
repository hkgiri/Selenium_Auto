package automates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write to print the font size and font type and font color of forgot Account link present in facebook.
public class Font_Size_Type {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		Thread.sleep(2000);
		String size = link.getCssValue("font-size");
		Thread.sleep(2000);
		System.out.println("font size is: "+size);
		Thread.sleep(2000);
		String font = link.getCssValue("font-family");
		Thread.sleep(2000);
		System.out.println("font type is: "+font);
		Thread.sleep(2000);
		String colour = link.getCssValue("color");
		System.out.println("font colour is: "+colour);
		driver.quit();
	}
	
}
