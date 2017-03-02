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
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.tabs.remote.autostart.2", false);
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get(Constant.GOMED_CC_URL);
		waitVar = new WebDriverWait(driver, 45);
	}
	
	public void createDriver(String url) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.tabs.remote.autostart.2", false);
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get(url);
		waitVar = new WebDriverWait(driver, 45);
	}

	/**
	 * This function is to close driver instance
	 */
	public void teardown() {
		driver.quit();
	}
}
