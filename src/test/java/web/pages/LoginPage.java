package web.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.DriverFactory;

public class LoginPage extends DriverFactory {
	/**
	 * All locators will be mentioned here
	 *
	 * For this example i am not using properties file for reading locators
	 */
	By loginSection = By.className("login");
	By loginButton = By.id("btnLogin");
	By usernameInput = By.name("username");
	By passwordInput = By.name("password");
	By listOrderPage = By.xpath("//li[@class='uk-active']/span");

	/**
	 * All functions related to behavior will follow now
	 */
	public void ishomepageDisplayed(String url) {
		driver.get(url);
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginSection));
		driver.findElement(loginSection).isDisplayed();
	}

	public void isloginsectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginSection));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginButton));
	}

	public void inputUsernameAndPassword(String username, String password) {
		driver.findElement(usernameInput).sendKeys(username);
		driver.findElement(passwordInput).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void verifyErrorMessage(String msg) {
		assertEquals("Please fill out this field.", driver.findElement(usernameInput).getAttribute("validationMessage"));

	}

}
