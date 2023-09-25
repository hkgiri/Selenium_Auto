package automates;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//login naukri.com and upload resume.
public class FileUploadPOPUP_Naukari {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("mkgiri1997@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("POPmkgiri1997@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Complete']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		File f=new File("./data/Hemant Kumar.pdf");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(abspath);
		
	}
}
