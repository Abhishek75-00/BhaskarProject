package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Facebooklogin;



public class Testclass {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\abhi\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Facebooklogin a=new Facebooklogin(driver);
		a.clickonEmailid();
		a.clickonPassword();
		a.clickonLoginbutton();
		
	}
}
