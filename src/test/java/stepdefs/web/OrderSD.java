package stepdefs.web;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.DashboardPage;
import web.pages.OrderPage;

public class OrderSD {

	DashboardPage dp = new DashboardPage();
	OrderPage op = new OrderPage();

	@Then("^order list page will be displayed$")
	public void order_list_page_will_be_displayed() throws Throwable {
	op.isOrderPageDisplay();
	}

	@When("^search by \"([^\"]*)\" as order id and \"([^\"]*)\" as order date and \"([^\"]*)\" as customer id$")
	public void search_by_as_order_id_and_as_order_date_and_as_customer_id(String orderId, String orderDate, String customerId) throws Throwable {
	   op.searchByOrderIdAndOrderDateAndCustomerId(orderId, orderDate, customerId);
	}
	
	@Then("^get the following order list result:$")
	public void get_the_following_order_list_result(DataTable orders) throws Throwable {
	    op.isResultDisplayed();
	}

}
