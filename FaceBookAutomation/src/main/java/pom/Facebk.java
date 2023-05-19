package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebk {


		
			
			@FindBy(xpath="//input[@id='email']")
			private WebElement userName;

			//a[@id='nav-link-accountList']
			@FindBy(xpath="//input[@id='pass']")
			private WebElement passWord ;

			@FindBy (xpath ="//button[text()='Log in']")
			private WebElement loginButton ;
			
			
			
			private WebDriver driver;
			private WebDriverWait wait;
			private Actions actions;
			
			public Facebk(WebDriver driver) {
				// TODO Auto-generated constructor stub
				PageFactory.initElements(driver, this);
				 this.driver=driver;
				 actions =new Actions(driver);
					}
			


			public void clickonEmailid() {
			wait=new WebDriverWait (driver, 30);
				wait.until(ExpectedConditions.visibilityOf(userName));
				userName.sendKeys("arkamble14111996@gmail.com");}
				//actions.moveToElement(userName).sendKeys("arkamble14111996@gmail.com").perform();
			
			
			public void clickonPassword() {
				wait=new WebDriverWait (driver, 30);
				wait.until(ExpectedConditions.visibilityOf(passWord));
				passWord.sendKeys("120190210");;
				}
			
			
			public void clickonLoginbutton() {
			
				loginButton.click();
		}}


