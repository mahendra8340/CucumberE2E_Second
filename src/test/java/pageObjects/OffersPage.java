package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	

	WebDriver driver;
	By search=By.id("search-field");
	By productName=By.xpath("//table[@class='table table-bordered']//tbody//td[1]");
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchItem(String productName)
	{
		driver.findElement(search).sendKeys(productName);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
}
