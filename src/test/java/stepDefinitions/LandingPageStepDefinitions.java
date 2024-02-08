package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

	TestContextSetup testContextSetup;
	LandingPage landingPage;
	public LandingPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {

		Assert.assertTrue(testContextSetup.pageObjectManager.getLandingPage().getTitleLandingPage().contains("GreenKart"));
	}

	@When("^User searched with shortname (.+) extrancted actual name of the product$")
	public void user_searched_with_shortname_extrancted_actual_name_of_the_product(String prodName) throws InterruptedException {
		landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(prodName);
		testContextSetup.landingPageProd = (landingPage.getProductName().split(" "))[0];

	}
	
	@When("Added {string} items to the cart")
	public void add_items_toCart(String qty)
	{
		landingPage.incrementQty(Integer.parseInt(qty));
		landingPage.addToCart();
	}

}
