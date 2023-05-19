package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebooklogin {
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;

	//a[@id='nav-link-accountList']
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passWord ;

	@FindBy (xpath ="//button[text()='Log In']")
	private WebElement loginButton ;
	
	
	
	private WebDriver driver2;
	private WebDriverWait wait;
	private Actions actions;
	

	

	public Facebooklogin(WebDriver driver2) {
	PageFactory.initElements(driver2, this);
		 this.driver2=driver2;
		 actions =new Actions(driver2);
			}


	public void clickonEmailid() {
	wait=new WebDriverWait (driver2, 30);
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("arkamble14111996@gmail.com");}
		//actions.moveToElement(userName).sendKeys("arkamble14111996@gmail.com").perform();
	
	
	public void clickonPassword() {
		wait=new WebDriverWait (driver2, 30);
		wait.until(ExpectedConditions.visibilityOf(passWord));
		passWord.sendKeys("120190210");;
		}
	
	
	public void clickonLoginbutton() {
		wait=new WebDriverWait (driver2, 30);
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
}}
//input[@id='email']
//input[@id='pass']
//button[text()='Log In']