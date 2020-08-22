package com.selenium.quratebdd.cucumberFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver getNewDriverInstance(String browserName) {
		WebDriver driver = null;
		switch (browserName.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "IE":
			break;
		default:

		}

		return driver;
	}
}
