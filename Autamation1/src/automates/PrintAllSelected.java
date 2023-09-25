package automates;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write to print all the selected option presenting SLV listBox.
public class PrintAllSelected {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Automation%20static%20webpage/Hotel.html");
			WebElement slvlistbox = driver.findElement(By.id("slv"));
			Select s=new Select(slvlistbox);
			Thread.sleep(500);
			s.selectByIndex(0);
			Thread.sleep(500);
			s.selectByVisibleText("chhola bature");
			Thread.sleep(2000);
			s.selectByValue("i");
			 List<WebElement> fsOption = s.getAllSelectedOptions();
			 for (WebElement web : fsOption) {
				System.out.println(web.getText());
			}
			 driver.close();
			
		}
	}

