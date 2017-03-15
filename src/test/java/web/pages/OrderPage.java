package web.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.DriverFactory;

public class OrderPage extends DriverFactory{
	
	By customerIdSearchField = By.xpath("//form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[1]/input");
	By searchButton = By.id("search");
	By orderPage = By.xpath("//li[@class='uk-active']/span[contains(text(),'List Order')]");
	By firstRowCustomerIdOrderTable = By.xpath("//tbody/tr[@class='odd']/td[5]");
	
	public void isOrderPageDisplay(){
		waitVar.until(ExpectedConditions.presenceOfElementLocated(orderPage));
		driver.findElement(orderPage).isDisplayed();
	}
	
	public void searchByOrderIdAndOrderDateAndCustomerId(String orderId, String orderDate, String customerId){
		driver.findElement(customerIdSearchField).sendKeys(customerId);
		driver.findElement(searchButton).click();
		
	}
	
	public void isResultDisplayed(){
		Assert.assertNotNull(driver.findElement(firstRowCustomerIdOrderTable).getText());
	}
	
}
