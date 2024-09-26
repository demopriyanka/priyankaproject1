package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\OFFICE\\eclipse-workspacenew\\mavpro1\\src\\test\\resources\\login.feature",
		glue="StepDefination",
		dryRun=false,
	    tags ="@smoke" ,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output"}
		
		)
public class TestRun 
{

	
}
