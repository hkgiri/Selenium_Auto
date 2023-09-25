package basic;
// write a script to check whether seleniumhq.org url is successfully navigating to selenium.dev or not.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigation {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("URL is navigating successfully and pass");
		}
		else
			System.out.println("URL is not navigating successfully and fail");
		driver.close();
	}
}
