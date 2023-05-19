package facebklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Facebk;


public class LoginTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\abhi\\chrome\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Facebk a=new Facebk (driver);
		a.clickonEmailid();
		a.clickonPassword();
		a.clickonLoginbutton();
	}
}

