package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProductDetailsPage;
import pages.ProductListingPage;
import pages.HomePage;
import pages.ShoppingCartSummaryPage;

public class HomePageStepDefination {

	private HomePage asp = HomePage.getInstance();

	public WebDriver driver = BasePage.getDriver();

	@Given("^Automation Practice Web Page is opened_$")
	public void automation_Practice_Web_Page_is_opened() throws Throwable {
		driver.get(Utilities.getConfigValue("url"));
	}

	@Then("^unsucessful login verification must be done \"([^\"]*)\" and \"([^\"]*)\"$")
	public void unsucessful_login_verification_must_be_done_and(String username, String password) throws Throwable {
		asp.clickSignInLink();
		asp.enterUserName(username);
		asp.enterPassword(password);
		asp.clickSignInButton();

	}

	@Then("^verify logo of website$")
	public void verify_logo_of_website() throws Throwable {
		Assert.assertTrue(asp.VerifyWebsiteLogo(), "website not opened properly");
	}

	@Then("^SearchBar with placeholder search$")
	public void searchbar_with_placeholder_search() throws Throwable {
		Assert.assertTrue(asp.VerifySearbarPlaceholder(), "searbar not detected");
	}

	@Then("^empty Cart on page$")
	public void empty_Cart_on_page() throws Throwable {
		Assert.assertTrue(asp.VerifyemptyCart(), "cart must be empty");
	}

	@Then("^Phone Number on page$")
	public void phone_Number_on_page() throws Throwable {
		Assert.assertTrue(asp.VerifyphoneNumber(), "phone number must me displayed");
	}

	@Then("^Sign-in link with mouse hover text$")
	public void sign_in_link_with_mouse_hover_text() throws Throwable {
		Assert.assertTrue(asp.VerifySignInMouseHover(), "mouser text not correct");
	}

	@Then("^Menu bar Link - WOMEN$")
	public void menu_bar_Link_WOMEN() throws Throwable {
		Assert.assertTrue(asp.VerifyMenuBar_Women(), "Menu bar iem women verified");
	}

	@Then("^Menu bar Link - DRESSES$")
	public void menu_bar_Link_DRESSES() throws Throwable {
		Assert.assertTrue(asp.VerifyMenuBar_Dresses(), "Menu bar iem Dresses verified");
	}

	@Then("^Menu bar Link - T-SHIRTS$")
	public void menu_bar_Link_T_SHIRTS() throws Throwable {
		Assert.assertTrue(asp.VerifyMenuBar_Tshirts(), "Menu bar iem Dresses verified");
	}
}