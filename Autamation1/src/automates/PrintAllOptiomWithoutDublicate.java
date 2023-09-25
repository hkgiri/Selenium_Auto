package automates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write to print all the options present in mtr listbox without dublicate.
public class PrintAllOptiomWithoutDublicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("i");
		Thread.sleep(2000);
		s.selectByVisibleText("poori");
		Thread.sleep(2000);
		s.selectByValue("c");
		Thread.sleep(2000);
		List<WebElement> allList = s.getAllSelectedOptions();
		TreeSet<String> ts=new TreeSet<>();
		System.out.println("*****With dublicate value*****");
		for (int i = 0; i < allList.size(); i++) {
			String text = allList.get(i).getText();
			ts.add(text);
			System.out.println(text);
		}
		System.out.println("*****Without dublicate value *****");
		for(String text:ts) {
			System.out.println(text);
		}
		driver.quit();
	}
}
