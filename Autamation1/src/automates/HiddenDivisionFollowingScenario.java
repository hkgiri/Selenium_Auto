package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* Automate the following scenario.
  1) open the browser.
  2) enter url.
  3) enter the police number as 123.
  4) click on DOB.
  5) select your DOB.
  6) enter the mobile number.
  7) click on 'let's renew button'.
  8) verify the text 'please enter valid police number' text is display or not.
 */
public class HiddenDivisionFollowingScenario {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//open the browser.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//waiting condition.
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");//enter url.
		driver.findElement(By.id("policynumber")).sendKeys("123");//write in police number textbox.
		driver.findElement(By.id("dob")).click();//click on d.o.b hidden division.
		//select month path.
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);//create a select object.
		s.selectByIndex(2);//select month.
		//select year path.
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(year);//create a Select object.
		s1.selectByValue("2000");//select year
		driver.findElement(By.xpath("//a[text()='5']")).click();//click on date and selected.
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");//enter mobile number.
		driver.findElement(By.id("renew_policy_submit")).click();//click on let's renew button.
		WebElement errormsg = driver.findElement(By.id("policynumberError"));//select a police error msg.
		boolean msg = errormsg.isDisplayed();//check whether errormsg is displayed or not.
		String text = errormsg.getText();//error massage save in text variable. 
		if (msg==true) {
			System.out.println("it is displayed and pass: "+text);
		}
		else
		{
			System.out.println("it is not displayed and fail: "+text);
		}
		//driver.close();//close the browser.
		
	}
}
