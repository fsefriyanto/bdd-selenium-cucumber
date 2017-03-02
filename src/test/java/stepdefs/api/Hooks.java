package stepdefs.api;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class Hooks {
	DriverFactory df = new DriverFactory();

	@Before
	public void beforeScenario() throws MalformedURLException, InterruptedException {
		df.createDriver();
	}

	@After
	public void afterScenario() {
		df.teardown();
	}
}
