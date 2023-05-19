package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	@FindBy (xpath="//a[@data-csa-c-content-id='nav_cs_bestsellers']")
    private WebElement BestSeller;
	
	@FindBy (xpath="data-csa-c-content-id=\"nav_cs_mobiles\"")
    private WebElement Mobiles;
	
	
	public Headers(WebDriver driver) {
		// TODO Auto-generated constructor stub
		{
			PageFactory.initElements(driver, this);
		}
	}

	public void BestSeller()
	{
		BestSeller.click();
	}
	
	public void Mobiles()
	{
		Mobiles.click();
	}
	
}

