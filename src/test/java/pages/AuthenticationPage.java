package pages;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;

public class AuthenticationPage extends BasePage implements SeleniumQurateAutomationPageInterface {

	public static AuthenticationPage asp = null;
	
		
	public static AuthenticationPage getInstance() {
		if (AuthenticationPage.asp == null)
			asp = new AuthenticationPage();
		return asp;
	}

	public boolean successfulLogin_shopping() throws IOException {
	
		try {

			// selecting dress and adding to cart
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(DressesSection_Button)).perform();
			action.build();
			Utilities.explicitWait(driver.findElement(SummerDresses_Button), driver);
			driver.findElement(SummerDresses_Button).click();

			action.moveToElement(driver.findElement(firstItem)).perform();
			// action.click().perform();
			action.build();
			driver.findElement(SummerDressesProduct_click).click();

			driver.switchTo().frame(0);
			// selecting M size
			Select size_dropdown = new Select(driver.findElement(size_Dropdown));
			size_dropdown.selectByValue("2");

			Utilities.explicitWait(driver.findElement(addcart_button), driver);
			driver.findElement(addcart_button).click();
			
			
			driver.findElement(proceedCheckout).click();
			driver.findElement(proceedCheckout_Summary).click();
			driver.findElement(Username_textbox).sendKeys(Utilities.getConfigValue("username"));
			driver.findElement(Password_textbox).sendKeys(Utilities.getConfigValue("password"));
			driver.findElement(Signin_Button).click();
			
						
			if (driver.findElement(Signout_Button).isDisplayed())
				System.out.println("Authentication Successful");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}


		
	}
	
}
