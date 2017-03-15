package stepdefs.web;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.DashboardPage;
import web.pages.LoginPage;

public class LoginSD {
	LoginPage lp = new LoginPage();
	DashboardPage lop = new DashboardPage();

	@Given("^user is on gomed cc loginpage with url \"(.*?)\"$")
	public void userIsOnLoginpage(String url) {
		lp.ishomepageDisplayed(url);
	}

	@When("^user clicks Log in button$")
	public void user_clicks_Sign_in_button() {
		lp.clickLoginButton();
	}

	@Then("^user gets an error message \"(.*?)\"$")
	public void user_gets_an_error_message(String arg1) {
		lp.verifyErrorMessage(arg1);
	}
	
	@When("^user enter \"([^\"]*)\" as username and \"([^\"]*)\" as password and clicks Log in button$")
	public void user_enter_as_username_and_as_password_and_clicks_Log_in_button(String username, String password) throws Throwable {
		lp.inputUsernameAndPassword(username, password);
	    lp.clickLoginButton();
	}

	@Then("^user should be shown dashboard page$")
	public void user_should_be_shown_dashboard_page() throws Throwable {
	    lop.isListOrderPageDisplayed();
	}


}
