package web.pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class ProductCategoryPage extends DriverFactory{
	
	By searchCodeField = By.xpath("//form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[1]/input");
	By searchNameField = By.xpath("//form[contains(@class,'form-filter')]/div[@class='uk-grid']/div[2]/input");
	By searchButton = By.id("search");
	By productCategoryPage = By.xpath("//li[@class='uk-active']/span");
	
	public void searchByName(String name){
		driver.findElement(searchNameField).sendKeys(name);
		driver.findElement(searchButton).click();
	}
	
	public void searchByCode(String code){
		driver.findElement(searchCodeField).sendKeys(code);
		driver.findElement(searchButton).click();
	}
	
}
