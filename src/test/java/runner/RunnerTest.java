package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.quratebdd.cucumberFramework.BasePage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src/test/resources/features" },
		glue = { "stepdefinitions" },
		tags = { "@SeleniumQurate" },	
//		monochrome = true, // display console output in readable format
		dryRun = false//check if all the steps have step def
//		strict = true// will fail execution if there are undefined or pending steps
		
)
public class RunnerTest {
		 
}



























//@RunWith(Cucumber.class)
//@CucumberOptions(
//			//plugin = {"rerun:D:/rerun.txt","pretty","html:target/cucumber","json:target/cucumber.json","html:target/cucumber-html-report"},   //controls the output format of your reports
//		plugin = { 
//				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
//				"pretty",
//				"html:target/cucumber-reports",
//	            "json:target/cucumber.json",
//				"rerun:target/rerun.txt"
//				},
//			features = {"src/test/resources/features"},
//			glue = {"stepdefinitions"},
//			tags = {"@header"},
//			strict = false ,     //if step definition is not there then fail the test case . 
////Default value is false which means mark feature file as pass but show missing snippet
//			dryRun = false,
//			monochrome = true
//)

//	
//}




//mvn test -Dcucumber.options="--tags @TC01"
//goal and options=clean install -Dcucumber.options="--tags $tags 