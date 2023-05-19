package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.FlipkartLogin;

public class FlipkartLoginTestClass {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		FlipkartLogin f = new FlipkartLogin(driver);					
		f.LoginAcc();
	
	}
}

