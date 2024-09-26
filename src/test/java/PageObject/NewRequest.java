package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRequest 
{
	

		public WebDriver ldriver;
		
		public NewRequest(WebDriver rdriver) 
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
	  @FindBy(xpath="//*[@id='q-app']/div/div[1]/aside/div/div[2]/section[1]/div[2]/div/div[1]/div[2]/div")
	  WebElement accomodation;
	  
	  @FindBy(xpath="/html/body/div[7]/div/div[1]/aside/div/div[2]/section[1]/div[2]/div/div[2]/div/div/a[2]/div[2]/div")
	  WebElement newrequest;
	  
	  @FindBy(xpath="//div[text()='Weight Loss Eligibility Intake Form test']")
	  WebElement WeightLossEligibilityIntakeFormtest;
	
      @FindBy(xpath="//*[@id='q-app']/div/div[2]/main/form/div/div/div[3]/div[2]/div/label/div/div/div[1]/div")
	  WebElement genderfield;
      
	  @FindBy(xpath="//span[text()='Female']")
	  WebElement female;
	  
	  @FindBy(xpath="//span[text()='Continue']")
	  WebElement continuebtn;
	
	  @FindBy(xpath="/html/body/div[7]/div/div[2]/main/form/div/div/div[4]/div[2]/div/label/div/div/div/input")
	  WebElement textage;
	

	  @FindBy(xpath="/html/body/div[7]/div/div[2]/main/form/div/div/div[5]/div[2]/div/label/div/div/div/input")
	  WebElement textheight;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement textweigh;
	  
	  @FindBy(xpath="//*[text()='none of the above']//preceding::div[1]")
	  WebElement clicknoneofabove;
	  

	  @FindBy(xpath="//*[text()='Eating disorders']//preceding::div[1]")
	  WebElement clickoneatingdisorders;
	  
	  @FindBy(xpath="/html/body/div[7]/div/div[2]/main/form/div/div/div[9]/div[2]/div/label/div/div/div[1]/div")
	  WebElement clickonweightlossgoal;
	  
	  @FindBy(xpath="/html/body/div[10]/div/div[2]/div[4]/div[2]/div/span")
	  WebElement Maintainmyhealthyweight;
	  
	  
	  @FindBy(xpath="//*[text()='Exercise']//preceding::div[1]")
	  WebElement exercise;
	  
	  @FindBy(xpath="//*[text()='26']")
	  WebElement dateofbirth;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement emailaddress;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement phonenumber;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement shippingaddress;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement city;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement state;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement zipcode;
	  
	  @FindBy(xpath="//*[@class='q-radio__inner relative-position q-radio__inner--falsy']")
	  WebElement radiobtnno;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__native q-placeholder')]")
	  WebElement selectlang;
	  
	  @FindBy(xpath="//*[contains(@class,'q-field__input fit absolute-full cursor-pointer')]")
	  WebElement fileupload;
	  
	  @FindBy(xpath="//*[text()='Submit']")
	  WebElement btnsubmit;
	  
	  @FindBy(xpath="//span[text()='Cancel']//following::span[1]")
	  WebElement submit;
	  
	  @FindBy(xpath="//*[text()=' Thank you for your submission. We have sent you a confirmation email for your records. ']")
	  WebElement successmsg;
	  
	  @FindBy(xpath="//span[text()='Close']")
	  WebElement close;
	   
	  
	 
	 
	  public void clickonaccomodation() 
	  {
		   WebDriverWait wait=new WebDriverWait(ldriver,20);
		   wait.until(ExpectedConditions.visibilityOf(accomodation));
		   Actions act=new Actions(ldriver); 
		   act.moveToElement(accomodation).perform();
	  }
	  public void clickonnewrequest() throws InterruptedException 
	  {    
		  Thread.sleep(5000);
//	       Actions act=new Actions(ldriver); 
//		   act.click(newrequest).perform();
		   newrequest.click();
	  }
	  public void WeightLossEligibilityIntakeFormtest()
	  {
		   WebDriverWait wait=new WebDriverWait(ldriver,20);
		   wait.until(ExpectedConditions.visibilityOf(WeightLossEligibilityIntakeFormtest));
		   Actions act=new Actions(ldriver);
		   act.moveToElement(WeightLossEligibilityIntakeFormtest).click().build().perform();
		  
		 // WeightLossEligibilityIntakeFormtest.click();
	  }
	  
	   public void selectfemale()
	  {
		   WebDriverWait wait=new WebDriverWait(ldriver,20);
		   wait.until(ExpectedConditions.visibilityOf(genderfield));
		  genderfield.click();
//		  Actions act=new Actions(ldriver);
//		  act.moveToElement(female).click().build().perform();
		  
		   wait.until(ExpectedConditions.visibilityOf(female));
		  female.click();
		   wait.until(ExpectedConditions.visibilityOf(continuebtn));
		  continuebtn.click();
		   
	  }
	  public void enterage(String age)
	  {
		   
		   textage.click();
		   textage.sendKeys(age);
		   continuebtn.click();
	  }
	  public void enterheight(String height)
	  {
		  textheight.sendKeys(height);
		   continuebtn.click();
	  }
	  public void enterweigh(String weigh)
	  {
		  textweigh.sendKeys(weigh);
		  continuebtn.click();
	  }  
	 
	  public void clicknoneofabove()
	  {
		  clicknoneofabove.click();
		  continuebtn.click();
		  
	  }
	  public void clickoneatingdisorders()
	  {
		  clickoneatingdisorders.click();
		  continuebtn.click();
		  
	  }  
	  public void clickonweightlossgoal()
	  {
		  JavascriptExecutor js = (JavascriptExecutor) ldriver;
          js.executeScript("window.scrollBy(0,-150)", "");
		  WebDriverWait wait=new WebDriverWait(ldriver,20);
		   wait.until(ExpectedConditions.visibilityOf(clickonweightlossgoal));
		  clickonweightlossgoal.click();
//		  Actions act=new Actions(ldriver);
//		  act.moveToElement(Maintainmyhealthyweight).click().build().perform();
		  wait.until(ExpectedConditions.visibilityOf(Maintainmyhealthyweight));
		  Maintainmyhealthyweight.click();
		  continuebtn.click();
		  
	  }   
	  
	  public void selectcheckbox()
	  {
		  exercise.click();
		  continuebtn.click();
	  }   
	  
	  public void selectdateofbirth()
	  {
		  dateofbirth.click();
		  continuebtn.click();
	  }   
	  public void enteremailaddress(String emailaddress1)
	  {
		  emailaddress.sendKeys(emailaddress1);
		   continuebtn.click();
	  }
	  public void enterphonenumber(String phonenumber1)
	  {
		  phonenumber.sendKeys(phonenumber1);
		   continuebtn.click();
	  }
	  public void entershippingaddress(String shippingaddress1)
	  {
		  shippingaddress.sendKeys(shippingaddress1);
		   continuebtn.click();
	  }
	  public void entercity(String city1)
	  {
		  city.sendKeys(city1);
		   continuebtn.click();
	  }
	  public void enterstate(String state1)
	  {
		   state.sendKeys(state1);
		   continuebtn.click();
	  }
	  public void enterzipcode(String zipcode1)
	  {
		    zipcode.sendKeys(zipcode1);
		   continuebtn.click();
	  }
	  public void selectradiobtn()
	  {
		  radiobtnno.click();
		  continuebtn.click();
	  }  
	  public void selectlang(String lang1)
	  {
		   selectlang.sendKeys(lang1);
		   continuebtn.click();
	  }
	  
	  public void uploadfile() throws InterruptedException
	  {
		  JavascriptExecutor js1 = (JavascriptExecutor) ldriver;
          js1.executeScript("window.scrollBy(0,100)", "");
          
		  fileupload.sendKeys("C:\\Users\\OFFICE\\eclipse-workspacenew\\mavpro1\\passport size photo.jpg");
		  
		  WebDriverWait wait3=new WebDriverWait(ldriver,3000);
		  wait3.until(ExpectedConditions.visibilityOf(continuebtn));
		  
		  Thread.sleep(5000);
		  Actions act=new Actions(ldriver);
		  act.click(continuebtn).perform();
		 // continuebtn.click();
	  } 
	  public void clickonsubmitbtn()
	  {
		  btnsubmit.click();
		  
	  } 
	  public void clickonsubmit() throws InterruptedException
	  {
		 
		  Thread.sleep(5000);
		 // Alert alert = ldriver.switchTo().alert();
		  Actions act=new Actions(ldriver);
		  act.moveToElement(submit).click().build().perform();
		//  submit.click();
		  
	  } 
	 
	  public void validatesuccessmsg()
	  {
		  
		  
	  }
	  public void clickonclose()
	  {
		  Actions act=new Actions(ldriver);
		  act.moveToElement(close).click().build().perform();
		 // close.click();
		  
	  } 
	 
}
