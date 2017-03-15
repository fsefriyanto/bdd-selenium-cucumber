package web.pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class CustomerPage extends DriverFactory{
	
	By customerIdFieldSearch = By.xpath("//div[@id='search-wrapper']/form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[1]/input");
	By phoneFieldSearch = By.xpath("//div[@id='search-wrapper']/form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[3]/input");
	By searchButton = By.id("search");
	By customerPage = By.xpath("//li[@class='uk-active']/span[contains(text(),'List Customer')]");
	
	
	public void searchByPhoneAndCustomerId(String phoneNumber, String customerId){
		driver.findElement(phoneFieldSearch).sendKeys(phoneNumber);
		driver.findElement(customerIdFieldSearch).sendKeys(customerId);
		driver.findElement(searchButton).click();
		
	}
	
	public void isCustomerPageDisplayed(){
		driver.findElement(customerPage).isDisplayed();
	}
	
	
}
