package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public CheckOutPage checkOutPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		if (landingPage == null)
			landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OffersPage getOffersPage() {
		if (offersPage == null)
			offersPage = new OffersPage(driver);
		return offersPage;
	}

	public CheckOutPage getCheckOutPage() {
		if (checkOutPage == null)
			checkOutPage = new CheckOutPage(driver);
		return checkOutPage;

	}

}
