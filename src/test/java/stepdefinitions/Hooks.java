package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.quratebdd.cucumberFramework.BasePage;
import com.selenium.quratebdd.cucumberFramework.SingletonDriver;

import Utils.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private WebDriver driver;
	@Before()
	public void setup() throws IOException {
		// DriverFactory.getNewDriverInstance("chrome");
		// Reporter.assignAuthor("BDD - Archit Goel");
		driver = SingletonDriver.getDriverInstance();    
		BasePage.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("*******Start of Scenario *********");
}
	@After()
	public void afterScenario() {
					driver.quit();
			//p SingletonDriver.deInstantiateDriver();
			System.out.println("*******End of Scenario *********");
		
	}
		
	
	

}













//@After("@First") tagged hooks ,  @Before("@First,@Third")
// @Before(order=0) execution order