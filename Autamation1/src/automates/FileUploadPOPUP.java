package automates;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOPUP {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/naukari.html");
		Thread.sleep(2000);
		File f=new File("./data/Resume.docx");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abspath);
		
	}
}
