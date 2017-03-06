package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/web", glue = "stepdefs.web", plugin = { "pretty", "html:target/cucumber", })
public class RunBDDTest {
}
