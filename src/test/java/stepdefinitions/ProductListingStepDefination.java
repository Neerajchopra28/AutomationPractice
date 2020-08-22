package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import pages.ProductListingPage;

public class ProductListingStepDefination {
	
	private ProductListingPage objProductListingPage = ProductListingPage.getInstance();

	
	@Then("^main bar visible with options$")
	public void main_bar_visible_with_options() throws Throwable {
		Assert.assertTrue(objProductListingPage.MouseHoverDresses_SelectDresses(), "menu bar is displayed");
	}

	@Then("^Sign out link is not visible$")
	public void sign_out_link_is_not_visible() throws Throwable {
		Assert.assertFalse(objProductListingPage.MouseHoverDresses_SingoutButton(),"Sign out link must not be visble");
	}
	
	@Then("^compare zero button$")
	public void compare_zero_button() throws Throwable {
	    Assert.assertTrue(objProductListingPage.VerifyCompareButton(),"compare button must be present");
	}

	@Then("^when dress with maximum price is clicked it redirect to product detail page$")
	public void when_dress_with_maximum_price_is_clicked_it_redirect_to_product_detail_page() throws Throwable {
	    Assert.assertTrue(objProductListingPage.ExpensiveDress_Click(),"after click t must take you to product detail page ");
	}

}
