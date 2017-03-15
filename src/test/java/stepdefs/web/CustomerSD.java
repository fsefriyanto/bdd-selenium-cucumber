package stepdefs.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.CustomerPage;
import web.pages.DashboardPage;

public class CustomerSD {

	DashboardPage dp = new DashboardPage();
	CustomerPage cp = new CustomerPage();

	@When("^search customer by \"([^\"]*)\" as mobile number and \"([^\"]*)\" as customer id$")
	public void search_by_as_mobile_number_and_as_customer_id(String phoneNumber, String customerId) throws Throwable {
	   cp.searchByPhoneAndCustomerId(phoneNumber, customerId);
	}

	@Then("^get the following customer list result:$")
	public void get_the_following_customer_list_result(DataTable customers) throws Throwable {
	    
	    List<List<String>> actualCustomers = new
	    ArrayList<List<String>>();
	    actualCustomers.add( Arrays.asList("MobileNumber", "CustomerId"));
	    actualCustomers.add( Arrays.asList("+62888-123-45678", "89d9f399-704b-4683-a26b-1e8e3b125f47"));
	    /* Use the diff method to differentiate two data
	    tables */
	    customers.diff(actualCustomers);
	}
	
	@Then("^customer page will be displayed$")
	public void customer_page_will_be_displayed() throws Throwable {
	    cp.isCustomerPageDisplayed();
	}
}
