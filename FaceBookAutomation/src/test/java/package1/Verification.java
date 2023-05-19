package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Headers;
import pom.LoginPage1;

public class Verification {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver","D:\\abhi\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
					driver.get("https://www.amazon.in/");
					LoginPage1 a=new LoginPage1(driver);
//					driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//					a.sendUserName();
//					a.sendPassword();
//					a.clickOnLogin();
//					
					driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);		
					Headers homePage = new Headers(driver);					
					homePage.BestSeller();
//					homePage.Mobiles();
}
}