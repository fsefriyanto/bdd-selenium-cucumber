package web.pages;

import static junit.framework.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
   

	/**
	 * All functions related to behavior will follow now
	 */
	public void ishomepageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginSection));
		driver.findElement(loginSection).isDisplayed();
	}

	public void isloginsectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginSection));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginButton));
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void verifyErrorMessage(String msg) {
		WebElement elem1 = driver.findElement(usernameInput);
		assertEquals("Please fill out this field.", driver.findElement(usernameInput).getAttribute("validationMessage"));
		
	} 
}
