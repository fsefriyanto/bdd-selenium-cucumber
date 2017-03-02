package stepdefs.api;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import utils.Constant;

public class ProductSD {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	private String ENDPOINT_GET_PRODUCT_BY_NAME = Constant.GOMED_CC_URL + "api/v1/products/";

	@Given("a product exists with an name of (.*)")
	public void a_product_exists_with_name(String name) {
		request = given().param("name", name);
	}

	@When("a user retrieves the product by name")
	public void aAserRetrievesTheProductByName() {
		response = request.when().get(ENDPOINT_GET_PRODUCT_BY_NAME);
		System.out.println("response: " + response.prettyPrint());
	}

	@Then("status code is (\\d+)")
	public void verifyStatusCode(int statusCode) {
		json = response.then().statusCode(statusCode);
	}

}
