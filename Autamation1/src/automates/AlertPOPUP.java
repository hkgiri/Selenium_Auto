package automates;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class AlertPOPUP {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();//open the browser.
			driver.get("https://demo.automationtesting.in/Alerts.html");//enter the url.
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();//click on alertbox button.
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//create an object of WebDriverWait.
			wait.until(ExpectedConditions.alertIsPresent());//assign the alertIs present in waiting condition.
			Alert a = driver.switchTo().alert();//call the switchTomethod and alertmethod with the help of driver.
			String text = a.getText();//assign thegetText() to print the text on alert pop-up.
			a.accept();//click on OK button present in alert pop-up.
			System.out.println(text);//print the text..
			
		}
	}


