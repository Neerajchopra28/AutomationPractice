package pages;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;

public class ShoppingCartSummaryPage extends BasePage implements SeleniumQurateAutomationPageInterface {

	public static ShoppingCartSummaryPage asp = null;

	public static ShoppingCartSummaryPage getInstance() {
		if (ShoppingCartSummaryPage.asp == null)
			asp = new ShoppingCartSummaryPage();
		return asp;
	}

	public boolean cartDetails() throws IOException {

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
			//driver.switchTo().defaultContent();

			driver.findElement(proceedCheckout).click();
			String cartProductCount = driver.findElement(cartCount).getText();

			if (cartProductCount.equalsIgnoreCase("1"))
				System.out.println("item has been added to cart");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

}
