package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooks_Steps {
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("This is the first step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("This is the second step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("This is the third step");
	}
}
