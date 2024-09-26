package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.NewRequest;
import PageObject.loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class step {
    public WebDriver driver;
	public loginpage lp;
	public NewRequest nr;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() 
	{
		
	    System.setProperty("webdriver.chrome.driver","C://Users//OFFICE//eclipse-workspacenew//mavpro1//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	    lp=new loginpage(driver);
	    nr=new NewRequest(driver);
	    driver.manage().window().maximize();
	}

	@When("User opens url{string}")
	public void user_opens_url(String URL) 
	{
	    driver.get(URL);
	}

	@And("user enters Email as{string}")
	public void user_enters_Email_as(String email) 
	{
	   lp.setEmail(email);
	}

	@When("user click on login with password")
	public void user_click_on_login_with_password() 
	{
	    lp.clickonloginwithpassword();
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) 
	{
	    lp.setpassword(password);
	}

	@When("click on continue button")
	public void click_on_continue_button() throws InterruptedException 
	{
	    lp.clickoncontinuebtn();
	    String s1=driver.getTitle();
	    System.out.println("Title of page is==============" +s1);
	}
	
	@Then("message display {string}")
	public void message_display(String title) 
	{
	   if(driver.getPageSource().contains("Invalid email or password"))
	   {
		   lp.errormessage();
		   driver.close();
		 //  Assert.assertTrue(false);
	   }
	   else
	   {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	}

	@When("close browser")
	public void close_browser() 
	{
	    driver.quit();
	}
	@When("user go to accomodation")
	public void user_go_to_accomodation() 
	{
	   nr.clickonaccomodation();
	}

	@Then("user go to new request")
	public void user_go_to_new_request() throws InterruptedException 
	{
	    nr.clickonnewrequest();
		
	}

	@Then("user click on Weight Loss Eligibility Intake Form")
	public void user_click_on_Weight_Loss_Eligibility_Intake_Form() 
	{
	    nr.WeightLossEligibilityIntakeFormtest();
	}

	@Then("user select female from What was your gender at birth and click on comtinue")
	public void user_select_female_from_What_was_your_gender_at_birth_and_click_on_comtinue() 
	{
	    nr.selectfemale();
	}

	@Then("user enters as{string}in What is your age Are you older than field")
	public void user_enters_as_in_What_is_your_age_Are_you_older_than_field(String age) 
	{
	    nr.enterage(age);
	}

	@Then("user enters as{string}in What is your height")
	public void user_enters_as_in_What_is_your_height(String heigh) 
	{
	    nr.enterheight(heigh);
	}

	@Then("user enters as{string}How much do you weigh")
	public void user_enters_as_How_much_do_you_weigh(String weigh) 
	{
	   nr.enterweigh(weigh); 
	}

	@Then("user select none of the above from Do you have any of the following conditions")
	public void user_select_none_of_the_above_from_Do_you_have_any_of_the_following_conditions() 
	{
	   nr.clicknoneofabove();
	}

	@Then("user select Eating disorders from Do you have any of the following conditions")
	public void user_select_Eating_disorders_from_Do_you_have_any_of_the_following_conditions() 
	{
	    nr.clickoneatingdisorders();
	}

	@Then("user select maintain my healthy waight from What are your weight loss goals")
	public void user_select_maintain_my_healthy_waight_from_What_are_your_weight_loss_goals() 
	{
		nr.clickonweightlossgoal();
	}

	@Then("user select exercise waight from What weight loss initiatives have you tried in the past")
	public void user_select_exercise_waight_from_What_weight_loss_initiatives_have_you_tried_in_the_past() 
	{
	    nr.selectcheckbox();
	}

	@Then("user select date of birth")
	public void user_select_date_of_birth() 
	{
	   nr.selectdateofbirth();
	}

	@Then("user enters emailaddress as{string}")
	public void user_enters_emailaddress_as(String eadd) 
	{
	   nr.enteremailaddress(eadd);
	}

	@Then("user enters phoneNumber as{string}")
	public void user_enters_phoneNumber_as(String pn) 
	{
		nr.enterphonenumber(pn);
	}

	@Then("user enters shippingAddress as{string}")
	public void user_enters_shippingAddress_as(String sadd) 
	{
	    nr.entershippingaddress(sadd);
	}

	@Then("user enters city as{string}")
	public void user_enters_city_as(String cit) 
	{
	    nr.entercity(cit);
	}

	@Then("user enters state as{string}")
	public void user_enters_state_as(String state) 
	{
	    nr.enterstate(state);
	}

	@Then("user enters pincode as{string}")
	public void user_enters_pincode_as(String pc) 
	{
	   nr.enterzipcode(pc);
	}

	@Then("user select No from Do you require translation services")
	public void user_select_No_from_Do_you_require_translation_services() 
	{
	    nr.selectradiobtn();
	}
	
	@Then("user enter preferred language{string}")
	public void user_enter_preferred_language(String lang) 
	{
		nr.selectlang(lang);
	}

	@Then("user upload government issued ID")
	public void user_upload_government_issued_ID() throws InterruptedException 
	{
	    nr.uploadfile();
	}

	@Then("user click on submitbutton")
	public void user_click_on_submitbutton() 
	{
	   nr.clickonsubmitbtn();
	}

	@Then("user click on submit")
	public void user_click_on_submit() throws InterruptedException 
	{
	   nr.clickonsubmit();
	}

	@Then("user confirm success message \" Thank you for your submission. We have sent you a confirmation email for your records.")
	public void user_confirm_success_message_Thank_you_for_your_submission_We_have_sent_you_a_confirmation_email_for_your_records() 
	{
	   nr.validatesuccessmsg();
	}

	@Then("click on closebtn")
	public void click_on_closebtn() 
	{
	   nr.clickonclose();
	}
		
	

}
