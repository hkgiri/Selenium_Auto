package automates;
/* test data:-
  url:- https://the-internet.herokuapp.com/basic_auth
  username:- admin
  password:- admin
 homepage:- https://admin:admin@the-internet.herokuapp.com/basic_auth 
 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPOPUP {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
