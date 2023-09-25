package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite_use {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2Fhire%3F%26aceid%3D%26gclid%3DCjwKCAjwvpCkBhB4EiwAujULMuUIRb2q6WlFa_M_1oabxa4TX3njQ-5QP_imQKaR3C8C3dC3JsQTLxoC8TYQAvD_BwE%26gclsrc%3Daw.ds&tmpl=desktop&from=gnav-util-employer--allspark--employer&_gl=1*1bux8c0*_gcl_aw*R0NMLjE2ODY0MDk3MjcuQ2p3S0NBand2cENrQmhCNEVpd0F1alVMTXVVSVJiMnE2V2xGYV9NXzFvYWJ4YTRUWDNualEtNVFQX2ltUUthUjNDOEMzZEMzSnNRVEx4b0M4VFlRQXZEX0J3RQ..*_gcl_dc*R0NMLjE2ODY0MDk3MjcuQ2p3S0NBand2cENrQmhCNEVpd0F1alVMTXVVSVJiMnE2V2xGYV9NXzFvYWJ4YTRUWDNualEtNVFQX2ltUUthUjNDOEMzZEMzSnNRVEx4b0M4VFlRQXZEX0J3RQ..*_gcl_au*MzQyMTQxMjY4LjE2ODY0MDk2MTk.");
		driver.navigate().to("https://accounts.google.com/o/oauth2/v2/auth/oauthchooseaccount?response_type=code&redirect_uri=https%3A%2F%2Fsecure.indeed.com%2Faccount%2Fgoogleauth&client_id=1047839414793-v442kdo3pt0vb43l8nu2c5sh9lf4bsnj.apps.googleusercontent.com&scope=openid%20email%20profile&state=yQim0LYMNbCBHIqnSBJtlISBKPoyF5PZ&nonce=uso3egByIFgYOUar&ui_locales=en-IN%20en&service=lso&o2v=2&flowName=GeneralOAuthFlow");
		
		driver.navigate().to("https://appleid.apple.com/auth/authorize?client_id=com.indeed.secure&redirect_uri=https%3A%2F%2Fsecure.indeed.com%2Faccount%2Fappleauth&response_type=code%20id_token&state=yQim0LYMNbCBHIqnSBJtlISBKPoyF5PZ&scope=name%20email&nonce=lVhDiWSQ5NbLHXdB&response_mode=web_message&frame_id=9229134e-5018-491b-8d53-4fb038356f1b&m=11&v=1.5.4");
		driver.close();
		
		
	}
}
