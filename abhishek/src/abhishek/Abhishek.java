package abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abhishek {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.rediff.com/");

Thread.sleep(1000);
driver.manage().window().maximize();
//WebElement topstories=driver.findElement(By.xpath("//div[text()='TOP STORIES']"));
//Actions act=new Actions(driver);
//act.moveToElement(topstories).click().build().perform();


List<WebElement>row=driver.findElements(By.xpath("//div[@id='topdiv_0']"));
int noofWebElements =row.size();
System.out.println(noofWebElements);

for(int i=0;i<row.size();i++) {
	  String data=row.get(i).getText();
	  System.out.println(data);
}

WebElement c1=row.get(0);
String data=c1.getText();
System.out.println(data);

//Thread.sleep(1000);
//WebElement NEW1=driver.findElement(By.xpath("(//div[@id='topdiv_0']//h2[4])"));
//NEW1.click();

String title=driver.getTitle();
System.out.println(title);
//(//div[@id='topdiv_0']//h2[4])


//div[text()='TOP STORIES']
	}

}
// invoke 