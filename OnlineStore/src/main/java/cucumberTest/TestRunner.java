package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue= {"stepDefinition"},
		//dryRun = true,
		monochrome=true,
		
		//plugin = {"html:outputsReport"},
		plugin = {"pretty"},
		
		//single Cucumber Tag
		//tags= {"@SmokeTest"}
		//tags= {"@RegressionTest"}
		//tags= {"@End2End"}
		
		//Execute all tests of a Feature tagged
		//tags= {"@FunctionalTest"}
		
		//Logically ANDing and ORing Tags
		//@SmokeTest OR @RegressionTest
		//tags= {"@SmokeTest,@RegressionTest"}
		//@SmokeTest AND @RegressionTest
		//tags= {"@SmokeTest","@RegressionTest"}
		
		//Ignore Cucumber 
		//Execute all tests of the feature tagged as @FunctionalTests but skip scenarios tagged as @SmokeTest 
		//tags = {"~@SmokeTest"}
		tags= {"@background"}
		)

public class TestRunner {

}
