package automates;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write a script to search for the specific option present in mtr listbox.
public class SearchForSpecificOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Dish Name");
		String name = sc.nextLine();
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		int count=0;
		for (WebElement web : alloptions) {
			String text = web.getText();
			if (text.equalsIgnoreCase(name)) {
				count++;
				break;
			}
		}
		if (count==1) {
			System.out.println("Dish is present in the dropdown");
		}
		else
			System.out.println("Dish is not present in the dropdown");
		
		driver.close();
	}
}
