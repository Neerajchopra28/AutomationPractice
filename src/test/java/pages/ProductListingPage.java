package pages;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;

public class ProductListingPage extends BasePage implements SeleniumQurateAutomationPageInterface {

	public static ProductListingPage asp = null;

	public static ProductListingPage getInstance() {
		if (ProductListingPage.asp == null)
			asp = new ProductListingPage();
		return asp;
	}

	// Pre-requisite: User mouse-hover to DRESSES and click SUMMER DRESSES

	public boolean MouseHoverDresses_SelectDresses() throws IOException {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(DressesSection_Button)).perform();
			action.build();
			Utilities.explicitWait(driver.findElement(SummerDresses_Button), driver);
			driver.findElement(SummerDresses_Button).click();

			if (driver.findElement(MenuBar).isDisplayed())
				System.out.println("Menu Bar is displayed");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean MouseHoverDresses_SingoutButton() throws IOException {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(DressesSection_Button)).perform();
			action.build();
			Utilities.explicitWait(driver.findElement(SummerDresses_Button), driver);
			driver.findElement(SummerDresses_Button).click();

			if (driver.findElement(Signout_Button).isDisplayed())
				System.out.println("Menu Bar is displayed");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean VerifyCompareButton() throws IOException {

		try {

			driver.findElement(womensection_Button).click();

			if (driver.findElement(compare_button).isDisplayed())
				System.out.println("compare button is displayed");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean ExpensiveDress_Click() throws IOException {

		try {
			driver.findElement(womensection_Button).click();

//			Select sort_dropdown = new Select(driver.findElement(sorting_dropdown));
//			sort_dropdown.selectByValue("price:desc");
//			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(firstItem)).perform();
			//action.click().perform();
			action.build();
			driver.findElement(Product_click).click();
			driver.switchTo().frame(0);
		Utilities.explicitWait(driver.findElement(addcart_button), driver);
			if (driver.findElement(addcart_button).isDisplayed())
				System.out.println("Product detail page is displayed");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
