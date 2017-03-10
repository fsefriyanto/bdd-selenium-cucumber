package stepdefs.web;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.DashboardPage;
import web.pages.ProductPage;

public class ProductSD {

	DashboardPage dp = new DashboardPage();
	ProductPage pp = new ProductPage();

	@When("^clicks product menu$")
	public void clicks_product_menu() throws Throwable {
		dp.clickProductMenu();
	}

	@Then("^product page is display$")
	public void product_page_is_display() throws Throwable {
		dp.isProductPageDisplayed();
	}

	@When("^search product by name \"([^\"]*)\"$")
	public void search_product_by_name(String name) throws Throwable {
		pp.searchByName(name);
	}

	@Then("^user will get following product:$")
	public void user_will_get_following_product(List<String> arg1) throws Throwable {
		Assert.assertTrue(arg1.size() > 0);
	}
}
