package PageObject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

	public WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/div[7]/div/div/main/div/div/div[3]/form/label/div/div[1]/div[1]/input")
	WebElement textEmail1;
  
  @FindBy(xpath="//a[@class='text-primary']")
  WebElement textloginwithPassword;
  
  @FindBy(name="password")
  WebElement textPassword;
  
  @FindBy(xpath="//span[text()='Continue']")
  WebElement btncontinue;
  
  @FindBy(xpath="//*[text()='Invalid email or password']")
  WebElement errormsg;
  
  public void setEmail(String email1) 
  {
	  WebDriverWait wait=new WebDriverWait(ldriver,20);
      wait.until(ExpectedConditions.visibilityOf(textEmail1));
	  textEmail1.sendKeys(email1);
  }
  public void clickonloginwithpassword() 
  {
	  WebDriverWait wait=new WebDriverWait(ldriver,20);
      wait.until(ExpectedConditions.visibilityOf(textloginwithPassword));
	  textloginwithPassword.click();
  }

  public void setpassword(String password1)
  {
	  textPassword.sendKeys(password1);
  }
  public void clickoncontinuebtn() throws InterruptedException
  {  
	  Thread.sleep(4000);
	  btncontinue.click();
	  Thread.sleep(7000);
	  
  }
  public void errormessage() 
  {
	  String s2=errormsg.getText();
	  System.out.println("Text of error message is================"+s2);
  }
  }
  
  
  

