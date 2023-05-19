package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//Verify the Sign in
	
		@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
		private WebElement signInDropdown;
		
		@FindBy (xpath="(//span[text()='Sign in'])[1]")
		private WebElement signInButton;
		
		@FindBy (xpath="//input[@type='email']")
		private WebElement userName;
		
		@FindBy (xpath="//input[@id='continue']")
		private WebElement continueLogin;
		
		@FindBy (xpath="//input[@name='password']")
		private WebElement passWord;
		
		@FindBy (xpath="//input[@id='signInSubmit']")
		private WebElement submit;
		
		
		
		public LoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
				
		public void signInDropdown()
		{
			signInDropdown.click();

		}
		

		
		public void userName() throws InterruptedException
		{
			Thread.sleep(4000);
			userName.sendKeys("arkamble14111996@gmail.com");
		}
		
		
		public void selectcontinueLogin()
		{
			continueLogin.click();
		}
		
		public void passWord()
		{
			passWord.sendKeys("7768846221");
		}
		
		public void submit()
		{
			submit.click();
		}
		public void subm()
		{
			submit.click();
		}
		
	}
//pratikshajadhav199428@gmail.com
//pritul@199428
