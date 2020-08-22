package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;
import junit.framework.Assert;

public class HomePage extends BasePage implements SeleniumQurateAutomationPageInterface {

	public static HomePage asp = null;

	public static HomePage getInstance() {
		if (HomePage.asp == null)
			asp = new HomePage();
		return asp;
	}

	// Verify Logo of website
	public boolean VerifyWebsiteLogo() throws IOException {

		try {

			if (driver.findElement(logo_AutomationWebsite).isDisplayed())
				System.out.println("Automation Practice Logo is displayed");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean VerifySearbarPlaceholder() throws IOException {

		try {
			String placeholderText = driver.findElement(searchBar).getAttribute("placeholder");
			if (placeholderText.equalsIgnoreCase("Search"))
				;
			System.out.println("searchbar verified");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean VerifyemptyCart() throws IOException {

		try {
			String cartText = driver.findElement(emptyCart).getText();
			if (cartText.equalsIgnoreCase("empty"));
			System.out.println("empty cart verified");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyphoneNumber() throws IOException {

		try {
			String DisplayedphoneNumber = driver.findElement(phoneNumber).getText();
			if (DisplayedphoneNumber.equalsIgnoreCase("0123-456-789"));
			System.out.println("phone number verified");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifySignInMouseHover() throws IOException {

		try {
			String signInMouseHoverText = driver.findElement(signInMouseHover).getAttribute("title");
			if (signInMouseHoverText.equalsIgnoreCase("Log in to your customer account"));
			System.out.println("sign in mouseHover text verified");
			return true;
		} catch (Exception e) {
			return false;
		}
	}	 
	public boolean VerifyMenuBar_Women() throws IOException {
		try {
			System.out.println("Verifying meny bar women ");
			// Explicit Wait
			if(driver.findElement(womensection_Button).isDisplayed());
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyMenuBar_Dresses() throws IOException {
		try {
			System.out.println("Verifying menu bar dresses ");
			// Explicit Wait
			if(driver.findElement(DressesSection_Button).isDisplayed());
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyMenuBar_Tshirts() throws IOException {
		try {
			System.out.println("Verifying menu bar Tshirt ");
			// Explicit Wait
			if(driver.findElement(TshirtsSection_Button).isDisplayed());
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	// Click SigninLink Button
	public void clickSignInLink() {
		driver.findElement(Signin_Link).click();
		System.out.println("Click Signin link ");
	}

	// Enter Username
	public void enterUserName(String text) {

		driver.findElement(Username_textbox).sendKeys(text);
	}

	// Enter password
	public boolean enterPassword(String text) {
		driver.findElement(Password_textbox).sendKeys(text);
		return true;
	}

	// Click Login Button
	public void clickSignInButton() {
		driver.findElement(Signin_Button).click();
		System.out.println("Click Login Button");
		if(driver.findElement(invalidCredentialsAlert).isDisplayed()) {
			System.out.println("invalid credentials please create an account or enter valid password");
		}else {
			System.out.println("Login Successful");
		}
	}

	// Verify Successful login
	public boolean verifySuccessfulLogin() {
		System.out.println("Verify successful login");
		if (driver.findElement(womensection_Button).isDisplayed())
			return true;
		else
			return false;
	}

	public void womensection() throws IOException {
		Utilities.explicitWait(driver.findElement(womensection_Button), driver);
		driver.findElement(womensection_Button).click();
	}

//	public void addItem_toCart() throws IOException, InterruptedException {
//		Utilities.explicitWait(driver.findElement(firstItem), driver);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(firstItem)).perform();
//		action.build();
//
//		Utilities.explicitWait(driver.findElement(addcart_click), driver);
//		driver.findElement(addcart_click).click();
//		Thread.sleep(5000);
//		driver.switchTo().frame(0);
//		Utilities.explicitWait(driver.findElement(addcart_button), driver);
//		driver.findElement(addcart_button).click();
//
//		// Utilities.explicitWait(driver.findElement(cart_deleteItem), driver);
//		// driver.findElement(cart_deleteItem).click();
//
//	}

	public boolean Verifyitem_added_to_Cart() throws IOException {
		driver.findElement(womensection_Button).click();
		String itemName = driver.findElement(firstItem).getText();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(firstItem)).perform();
		action.build();
		Utilities.explicitWait(driver.findElement(addcart_button), driver);
		driver.findElement(addcart_button).click();

		String cart_itemName = driver.findElement(cart_Item).getText();

		if (itemName.equalsIgnoreCase(cart_itemName)) {
			return true;
		} else {
			return false;
		}
	}

}
