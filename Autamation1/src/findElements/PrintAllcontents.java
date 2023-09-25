package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write to print the content of the webtable present on the webpage. (static webpage)
public class PrintAllcontents {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mkgir/OneDrive/Desktop/Demo2.html");
		List<WebElement> allcontent = driver.findElements(By.xpath("//td"));
		int count = allcontent.size();
		System.out.println(count);
		for (WebElement web : allcontent) {
			String content = web.getText();
			System.out.println(content);
		}
		
		
	}
}
