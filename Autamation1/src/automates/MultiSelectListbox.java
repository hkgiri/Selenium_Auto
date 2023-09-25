package automates;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		Thread.sleep(500);
		s.selectByVisibleText("dosa");
		Thread.sleep(500);
		s.deselectByVisibleText("vada");
		Thread.sleep(500);
		s.deselectByIndex(1);
		Thread.sleep(500);
		s.deselectByValue("i");
		Thread.sleep(500);
		System.out.println(s.isMultiple());
		driver.close();
	}
}
