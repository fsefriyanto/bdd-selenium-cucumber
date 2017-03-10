package stepdefs.web;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.DashboardPage;
import web.pages.ProductCategoryPage;

public class ProductCategorySD {
	
	ProductCategoryPage pcp = new ProductCategoryPage();
	DashboardPage dp = new DashboardPage();
	
	@When("^search product category by name \"([^\"]*)\"$")
	public void search_product_category_by_name(String name) throws Throwable {
		pcp.searchByName(name);
	}

	@Then("^user will get following product category:$")
	public void user_will_get_following_product_category(List<String> arg1) throws Throwable {
	    Assert.assertTrue(arg1.size() > 0);
	    
	}
	
	@When("^clicks product category menu$")
	public void clicks_product_category_menu() throws Throwable {
	    dp.clickProductCategoryMenu();
	}

	@Then("^product category page is display$")
	public void product_category_page_is_display() throws Throwable {
	   dp.isProductCategoryPageDisplayed();
	}

	@When("^search product category by code \"([^\"]*)\"$")
	public void search_product_category_by_code(String code) throws Throwable {
	    pcp.searchByCode(code);
	}

}
