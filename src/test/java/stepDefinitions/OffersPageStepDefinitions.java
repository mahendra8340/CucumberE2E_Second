package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinitions {

	TestContextSetup testContextSetup;

	public OffersPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^User searched for (.+) shortname in offers page to check if produt exists$")
	public void user_searched_for_shortname_in_offers_page_to_check_if_produt_exists(String prodName) throws InterruptedException {

		switchToOffersPage();
		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
		offersPage.searchItem(prodName);
		Thread.sleep(2000);
		testContextSetup.OfferPageProd = offersPage.getProductName();

	}

	public void switchToOffersPage() {
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchToChild();
	}

	@Then("Validates product name in landing page and offers page is same")
	public void validates_product_name_in_landing_page_and_offers_page_is_same() {

		Assert.assertTrue(testContextSetup.OfferPageProd.equalsIgnoreCase(testContextSetup.landingPageProd));

	}

}
