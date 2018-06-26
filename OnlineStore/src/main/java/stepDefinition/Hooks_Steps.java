package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Steps {
	
	@Given("^This is the first step$")
	public void this_is_the_first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is the first step");
		//throw new PendingException();
	}

	@When("^This is the second step$")
	public void this_is_the_second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is the second step");
		//throw new PendingException();
	}

	@Then("^This is the third step$")
	public void this_is_the_third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is the third step");
		//throw new PendingException();
	}

}
