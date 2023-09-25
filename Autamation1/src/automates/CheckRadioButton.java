package automates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 write a script to check whether gender radio button present in facebook is properly aligned or not.
 after clicking create new account button.
 note:- use thread sleep after clicking the button.
 */
public class CheckRadioButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		Thread.sleep(3000);
		if (y1==y2&&y2==y3) {
			System.out.println("all checkbox are aligned properly and pass ");
		}
		else {
			System.out.println("all checkbox are not aligned properly and fail");
		}
		driver.close();
	}
}
