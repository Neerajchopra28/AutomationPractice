package pages;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import Utils.Utilities;

public class ProductDetailsPage extends BasePage implements SeleniumQurateAutomationPageInterface {

	public static ProductDetailsPage asp = null;

	public static ProductDetailsPage getInstance() {
		if (ProductDetailsPage.asp == null)
			asp = new ProductDetailsPage();
		return asp;
	}

	public boolean VerifyProductDetails_Popup() throws IOException {

		try {
			// selecting summer dresses in dresses menu
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(DressesSection_Button)).perform();
			action.build();
			Utilities.explicitWait(driver.findElement(SummerDresses_Button), driver);
			driver.findElement(SummerDresses_Button).click();
			
			//selecting product of summer dresses
			action.moveToElement(driver.findElement(firstItem)).perform();
			action.build();
			driver.findElement(SummerDressesProduct_click).click();
			
			//switching to frame
			driver.switchTo().frame(0);
			String productname = driver.findElement(productPage_addedproduct).getText();
			
			//selecting M size
			Select size_dropdown = new Select(driver.findElement(size_Dropdown));
			size_dropdown.selectByValue("2");
			Utilities.explicitWait(driver.findElement(addcart_button), driver);
			driver.findElement(addcart_button).click();
			
			//returning back to frame
			driver.switchTo().defaultContent();
			Utilities.explicitWait(driver.findElement(productadded_popup_ProductName), driver);
			String productpopup_name = driver.findElement(productadded_popup_ProductName).getText();
			
			if (productname.equalsIgnoreCase(productpopup_name))
				System.out.println("popup box details  matching with selected product");
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
