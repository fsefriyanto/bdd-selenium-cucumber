package web.pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class ProductPage extends DriverFactory{
	
	By searchField = By.xpath("//form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[1]/input");
	By searchButton = By.id("search");
	
	public void searchByName(String name){
		driver.findElement(searchField).sendKeys(name);
		driver.findElement(searchButton).click();
	}
	
}
