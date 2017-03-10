package web.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.DriverFactory;

public class DashboardPage extends DriverFactory {
	
	By listOrderPage = By.xpath("//li[@class='uk-active']/span");
	By usernameLabel = By.className("logout");
	By leftMenuNav = By.id("side-nav");
	By slidingButton = By.xpath("//nav[@class='uk-navbar']/a[@id='fullPage']");
	By productCategoryMenu = By.xpath("//ul[@id='listView']/li[3]/a");
	By productMenu = By.xpath("//ul[@id='listView']/li[4]/a");
//	contains(text()='Some text')
//	By productCategoryPage = By.xpath("//li[@class='uk-active']/span");
	By productCategoryPage = By.xpath("//li[@class='uk-active']/span[contains(text(),'List Category')]");
	By productPage = By.xpath("//li[@class='uk-active']/span");

	public void isListOrderPageDisplayed() {
		driver.findElement(listOrderPage).isDisplayed();
	}
	
	public void isUsernameDisplayed(){
		driver.findElement(usernameLabel).isDisplayed();
	}
	
	public void isLeftMenuDisplayed(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(leftMenuNav));
		driver.findElement(leftMenuNav).isDisplayed();
	}
	
	public void isProductCategoryPageDisplayed(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productCategoryPage));
		driver.findElement(productCategoryPage).isDisplayed();
		Assert.assertEquals("List Category",driver.findElement(productCategoryPage).getText());
	}
	
	public void isProductPageDisplayed(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productPage));
		driver.findElement(productPage).isDisplayed();
		Assert.assertEquals("List Products",driver.findElement(productPage).getText());
		
	}
	
	public void clickProductCategoryMenu(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productCategoryMenu));
		driver.findElement(productCategoryMenu).click();
	}
	
	public void clickProductMenu(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(productMenu));
		driver.findElement(productMenu).click();
	}
	
	public void clickSlidingButton(){
		driver.findElement(slidingButton).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(leftMenuNav));
		driver.findElement(leftMenuNav).isDisplayed();
	}
}
