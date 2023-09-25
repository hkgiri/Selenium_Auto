package automates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* write a script automate the following scenario.
   1) go to demo.automationtesting.in/alerts.html.\
   2) click on alert with ok and cancel button.
   3) click on confirmation box button to get the pop-up.
   4) click cancel button on the pop-up.
   5) check whether "you pressed cancel" to get in displyed or not.
 */
public class AlertPOPUP1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();//open the browser.
		driver.get("https://demo.automationtesting.in/Alerts.html");//enter the url.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//waiting Implicitly.
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();//click on Alert with Ok & cancel button. 
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//click on display confirm button.
		Alert a = driver.switchTo().alert();//call the switchTomethod and alertmethod with the help of driver.
		a.dismiss();//click the cancel button.
		String text = driver.findElement(By.id("demo")).getText();//get the confirmation massage.
		if (text.equalsIgnoreCase("You Pressed Cancel")) {
			System.out.println("It is pass:"+text);
		}
		else {
			System.out.println("It is fail "+text);
		}
		
				
	}
}
