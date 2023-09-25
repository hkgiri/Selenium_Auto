package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print the status of checkbox present in actitime.
public class IsSelected_method {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if (checkbox==true) {
			System.out.println("Checkbox is checked");
		}
		else
			System.out.println("Checkbox is unchecked");
	}
}
