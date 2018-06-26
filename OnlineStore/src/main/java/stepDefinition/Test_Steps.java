package stepDefinition;

import java.util.List;
//import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.Constants;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver = null;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty(Constants.WebDriver_Name, Constants.WebDriver_Path);	
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		//throw new PendingException();
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		//throw new PendingException();

	}
/*
	@When("^User enters UserName and Passowrd$")
	public void user_enters_UserName_and_Passowrd() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log")).sendKeys(Constants.UserName);
		driver.findElement(By.id("pwd")).sendKeys(Constants.Passsword);
		driver.findElement(By.id("submit")).click();
		//throw new PendingException();
	}*/

//Parameterization without Example Keyword
	
	
/*	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_UserName_and_Password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log")).sendKeys(username);
		driver.findElement(By.id("pwd")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	    //throw new PendingException();
	}*/

	
// Scenario Outline with Example
/*	@When("^User enter name & pwd  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_name_pwd_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log")).sendKeys(arg1);
		driver.findElement(By.id("pwd")).sendKeys(arg2);
		driver.findElement(By.id("submit")).click();
		//throw new PendingException();
	}*/

//#Data table
	
/*	@When("^User enter Credential to Login$")
	public void user_enter_Credential_to_Login(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		List<List<String>> data = arg1.raw();
		driver.findElement(By.id("log")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("login")).click();
	}*/

//#Data table in Cucumber with header	
	
/*	@When("^User enter Credential to Login$")
	public void user_enter_Credential_to_Login(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String,String>> data = arg1.asMaps(String.class, String.class);
		driver.findElement(By.id("log")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("pwd")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.id("login")).click();
	    //throw new PendingException();
	}
*/
	//#Data table maps in Cucumber
	@When("^User enter Credential to Login$")
	public void user_enter_Credential_to_Login(/*DataTable arg1*/ List<Credentials> usercredentials) throws Throwable {
	    //method 1
		/*for(Map<String,String> data:arg1.asMaps(String.class, String.class)){
			driver.findElement(By.id("log")).sendKeys(data.get("username"));
			driver.findElement(By.id("pwd")).sendKeys(data.get("password"));
			driver.findElement(By.id("login")).click();
		}
		*/
		//method2
		for(Credentials credentials:usercredentials){
			driver.findElement(By.id("log")).sendKeys(credentials.getUsername());
			driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
			driver.findElement(By.id("login")).click();
		}
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
		//throw new PendingException();
	}

	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		//throw new PendingException();
	}

	@Then("^Message displyaed LogOut Successfully$")
	public void message_displyaed_LogOut_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("LogOut Successfully");
		//throw new PendingException();
	}

}
