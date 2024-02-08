package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;
	By search=By.className("search-keyword");
	By productName=By.cssSelector("h4.product-name");
	By increment=By.cssSelector("a.increment");
	By addToCart=By.cssSelector(".product-action button");
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchItem(String productName)
	{
		driver.findElement(search).sendKeys(productName);
	}
	
	public String getProductName() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(By.linkText("Top Deals")).click();
	}
	public void incrementQty(int qty)
	{
		int i=qty-1;
		while(i>0)
		{
			
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
		
	}
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
}
