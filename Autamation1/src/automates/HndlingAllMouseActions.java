package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/* Automate the following scenario:\
 1) go to vtiger.com.
 2) mouse over to resources.
 3) click on customer in drop down menu.
 4) double click on login.
 5) verify the login page disply or not.
 */
public class HndlingAllMouseActions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement clist = driver.findElement(By.id("country-filter"));
		Select s=new Select(clist);
		s.selectByValue("India");
		WebElement indslist = driver.findElement(By.id("industry-filter"));
		Select s1=new Select(indslist);
		s1.selectByVisibleText("Software");
		WebElement target1 = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions a1=new Actions(driver);
		a1.doubleClick(target1).perform();
		String title = driver.getTitle();
		if (title.equals("Login - Vtiger")) {
			System.out.println("The Login Page is Displayed -->"+title);
		}
		else {
			System.out.println("The Login Page is not Displayed -->"+title);
		}
		driver.close();

	}
}
