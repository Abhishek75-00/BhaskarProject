package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage1;

public class Testclass1 {

	public static void main(String[] args) throws InterruptedException {
		
			// TODO Auto-generated method stub
						System.setProperty("webdriver.chrome.driver","D:\\abhi\\chrome\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
						driver.get("https://www.amazon.in/");
						LoginPage1 a=new LoginPage1(driver);
					a.signInDropdown();
					a.userName();
					a.selectcontinueLogin();
					a.passWord();
					a.submit();
					

	}

}

