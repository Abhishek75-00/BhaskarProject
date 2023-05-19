package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class loginpage2 {
		
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement usernameTextBox;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement passTextBox;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginButton;
		
		public loginpage2(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}

		public boolean isButtonPresent() {
			
			boolean stateOfbutton=loginButton.isDisplayed();
			
			return stateOfbutton;
		}
		
		public void login(String user,String pass) {
			
			usernameTextBox.sendKeys(user);
			passTextBox.sendKeys(pass);
			loginButton.click();
		}
		

	}


