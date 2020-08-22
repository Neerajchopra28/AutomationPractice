package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import pages.ShoppingCartSummaryPage;

public class ShoppingCartSummaryStepDefination {

	private ShoppingCartSummaryPage objShoppingCartSummaryPage = ShoppingCartSummaryPage.getInstance();
	
	@Then("^cart must have one product in it$")
	public void cart_must_have_one_product_in_it() throws Throwable {
	   Assert.assertTrue(objShoppingCartSummaryPage.cartDetails(),"cart must have one product in it");
	}
	
}
