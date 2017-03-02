package stepdefs.web;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.LoginPage;

public class GomedCcLoginSD {
	LoginPage lp = new LoginPage();

	@Given("^user is on gomed cc loginpage$")
	public void userIsOnLoginpage() {
		lp.ishomepageDisplayed();
	}

	@When("^user clicks Log in button$")
	public void user_clicks_Sign_in_button() {
		lp.clickLoginButton();
	}

	@Then("^user gets an error message \"(.*?)\"$")
	public void user_gets_an_error_message(String arg1) {
		lp.verifyErrorMessage(arg1);
	}

}
