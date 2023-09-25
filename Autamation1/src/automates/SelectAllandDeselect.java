package automates;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write to select all the options present in mtr listbox and deselect them in reverse order.
public class SelectAllandDeselect {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allslist = s.getOptions();
		int count=allslist.size();
		for (int i = 0; i <count; i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		for (int i =count-1; i >=0 ; i--) {
			Thread.sleep(500);
			s.deselectByIndex(i);
		}
		driver.close();
	}
	
}
