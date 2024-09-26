package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyRequest
{
	public WebDriver ldriver;
	
	public MyRequest(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
 
  
  @FindBy(xpath="//*[@id='f_0e2a1b51-e992-4994-b628-e4ebbf5fdd44']/div/div/a[1]/div[2]/div")
  WebElement myrequest;
  
  public void clickonnewrequest() 
  {    WebDriverWait wait=new WebDriverWait(ldriver,20);
       wait.until(ExpectedConditions.visibilityOf(myrequest));
       Actions act=new Actions(ldriver); 
	   act.click(myrequest).perform();
	   //newrequest.click();
  }
	

}
