package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitimeByPropertyFile {
	public static void main(String[] args) throws IOException {
	//get the java representative object of the physical file.
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//create an object of properties class.
		Properties p=new Properties();
		//load the file.
		p.load(fis);
		//get the data(value) by passing the key.
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.close();
	}
}
