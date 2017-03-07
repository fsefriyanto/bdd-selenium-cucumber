package stepdefs.web;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.DashboardPage;

public class DashboardSD {
	
	DashboardPage dp = new DashboardPage();

	@When("^clicks sliding button$")
	public void clicks_sliding_button() throws Throwable {
	    dp.clickSlidingButton();
	}

	@Then("^left menu is display$")
	public void left_menu_is_display() throws Throwable {
	    dp.isLeftMenuDisplayed();
	}

}
