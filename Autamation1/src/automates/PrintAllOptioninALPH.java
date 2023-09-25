package automates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//write to print all the options present in mtr listbox in alphabetical order.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptioninALPH {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("c");
		Thread.sleep(1000);
		ArrayList<String> al=new ArrayList<>();
		List<WebElement> allsoption = s.getAllSelectedOptions();
		for (int i = 0; i <allsoption.size(); i++) {
			String text = allsoption.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for ( String text : al) {
			
			System.out.println(text);
		}
		driver.quit();
	}
}
