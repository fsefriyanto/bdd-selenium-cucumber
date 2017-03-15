package web.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.DriverFactory;

public class DashboardPage extends DriverFactory {

	By listOrderPage = By.xpath("//li[@class='uk-active']/span");
	By usernameLabel = By.className("logout");
	// By leftMenuNav = By.id("side-nav");
	By leftMenuNav = By.xpath("//ul[@id='listView']/li[@class='head']/h3");
	By slidingButton = By.xpath("//nav[@class='uk-navbar']/a[@id='fullPage']");
	By productCategoryMenu = By.xpath("//ul[@id='listView']/li[3]/a");
	By productMenu = By.xpath("//ul[@id='listView']/li[4]/a");
	By customerMenu = By.xpath("//ul[@id='listView']/li[5]/a");
	By orderMenu = By.xpath("//ul[@id='listView']/li[7]/a");
	By productCategoryPage = By.xpath("//li[@class='uk-active']/span[contains(text(),'List Category')]");
	By productPage = By.xpath("//li[@class='uk-active']/span[contains(text(),'List Products')]");

	public void isListOrderPageDisplayed() {
		driver.findElement(listOrderPage).isDisplayed();
	}

	public void isUsernameDisplayed() {
		driver.findElement(usernameLabel).isDisplayed();
	}

	public void isLeftMenuDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(leftMenuNav));
		driver.findElement(leftMenuNav).isDisplayed();
	}

	public void isProductCategoryPageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productCategoryPage));
		driver.findElement(productCategoryPage).isDisplayed();
	}

	public void isProductPageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productPage));
		driver.findElement(productPage).isDisplayed();

	}

	public void clickProductCategoryMenu() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productCategoryMenu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(productCategoryMenu));
	}

	public void clickProductMenu() {

		waitVar.until(ExpectedConditions.presenceOfElementLocated(productMenu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(productMenu));
	}

	public void clickSlidingButton() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(slidingButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(slidingButton));

	}

	public void clickOrderMenu() {

		waitVar.until(ExpectedConditions.presenceOfElementLocated(productMenu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(productMenu));
	}
	
	public void clickCustomerMenu() {

		waitVar.until(ExpectedConditions.presenceOfElementLocated(productMenu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(customerMenu));
	}
}
