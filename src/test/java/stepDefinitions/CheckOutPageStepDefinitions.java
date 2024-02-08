package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class CheckOutPageStepDefinitions {

	TestContextSetup testContextSetup;
	WebDriver driver;

	public CheckOutPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("Verify user has ability to enter promo code and place the order")
	public void Verify_user_has_ability_to_enter_promo_code() {

		Assert.assertTrue(testContextSetup.pageObjectManager.getCheckOutPage().verifyPromocode());
		Assert.assertTrue(testContextSetup.pageObjectManager.getCheckOutPage().verifyPlaceOrder());
	}

	@Then("^user proceeds to Checkout and validates the (.+) items in checkout page$")
	public void user_proceeds_to_checkOut(String vegName) throws InterruptedException {
		testContextSetup.pageObjectManager.getCheckOutPage().checkOutItems();
		

	}

}
