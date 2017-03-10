package utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	/**
	 * This function is to invoke Selenium Webdriver
	 *
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void createDriver() throws MalformedURLException, InterruptedException {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.tabs.remote.autostart.2", false);
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		waitVar = new WebDriverWait(driver, 45);
	}
	
	/**
	 * This function is to close driver instance
	 */
	public void teardown() {
		driver.quit();
	}
}
