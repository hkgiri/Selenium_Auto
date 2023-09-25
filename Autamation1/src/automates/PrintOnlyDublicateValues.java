package automates;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write a script to print only dublicate options present in mtr listbox.
public class PrintOnlyDublicateValues {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		ArrayList<String> al=new ArrayList<>();
		TreeSet<String> ts=new TreeSet<>();
		Select s=new Select(mtr);
		s.selectByIndex(1);
		s.selectByValue("i");
		s.selectByVisibleText("vada");
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			String text = alloptions.get(i).getText();
			if (!ts.add(text)) {
				al.add(text);
			}
		}
		System.out.println("print only Dublicate Value.");
		for ( String text: al) {
		System.out.println(text);	
		}
	}
}
