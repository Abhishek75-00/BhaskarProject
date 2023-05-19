package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {
	//Login Account
		@FindBy (xpath="//a[text()='Login']")
		private WebElement Login;
		
		@FindBy (xpath="(//input[@type='text'])[2]")
		private WebElement Email; 
		
		@FindBy (xpath="//input[@type='password']")
		private WebElement Pass;
		
		@FindBy (xpath="(//button[@type='submit'])[2]")
		private WebElement Submit;
		private Actions actions;
		public FlipkartLogin(WebDriver driver1)
		{
			PageFactory.initElements(driver1, this);
			actions =new Actions(driver1);
		}
		
		public void LoginAcc()
		{
	
			Login.click();
			
			
			   
				//	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
				//	for(int i=0;i<addr.size();i++)
					//{
					//	System.out.println("addr.get[i]");
					//}

					
			//driver.switchTo().window(addr.get(1));
			
		
			Email.click();
			Email.sendKeys("9766076796");
			
			Pass.click();
			Pass.sendKeys("pritul@1994");
			
			Submit.click();
		}
	}

