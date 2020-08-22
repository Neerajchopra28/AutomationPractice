package com.selenium.quratebdd.cucumberFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
	private static WebDriver driver;
	
	
	public static void initDriver(String browser) {
		if(null == driver) {
			switch (browser.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "IE":
				break;
			default:
			}
		}
	}
	public static WebDriver getDriverInstance() {
		if(null == driver) {
			initDriver("chrome"); //Default value chrome if not initialized
		}
		return driver;
	}
	public static void deInstantiateDriver() {
		driver = null;
	}
}