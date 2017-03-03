package web.pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class DashboardPage extends DriverFactory {
	
	By listOrderPage = By.xpath("//li[@class='uk-active']/span");
	By usernameLabel = By.className("logout");

	public void isListOrderPageDisplayed() {
		driver.findElement(listOrderPage).isDisplayed();
	}
	
	public void isUsernameDisplayed(){
		driver.findElement(usernameLabel).isDisplayed();
	}
}
