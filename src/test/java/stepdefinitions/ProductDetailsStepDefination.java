package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import pages.ProductDetailsPage;

public class ProductDetailsStepDefination {

	private ProductDetailsPage objProductdetailsPage = ProductDetailsPage.getInstance();
	
	@Then("^Product details verification of Popup after addToCart$")
	public void product_details_verification_of_Popup_after_addToCart() throws Throwable {
		Assert.assertTrue(objProductdetailsPage.VerifyProductDetails_Popup(), "product details of page and popup must be same ");
	}
}
