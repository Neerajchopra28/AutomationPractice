package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.selenium.quratebdd.cucumberFramework.BasePage;

import cucumber.api.java.en.Then;
import pages.AuthenticationPage;


public class AuthenticationStepDefination {
//	public WebDriver driver = BasePage.getDriver();
	
	private AuthenticationPage objAuthenticationPage = AuthenticationPage.getInstance();
	
	@Then("^login authentication after shopping$")
	public void login_authentication_after_shopping() throws Throwable {
	    Assert.assertTrue(objAuthenticationPage.successfulLogin_shopping(),"authenication after shopping is necessary ");
	}
	
}
