package com.selenium.quratebdd.cucumberFramework;

import org.openqa.selenium.WebDriver;


public class BasePage {

	public static WebDriver driver;   
	public static void setDriver(WebDriver driver)
	{
		BasePage.driver = driver;
	}
	public static WebDriver getDriver()
	{
		return BasePage.driver;
	}
}
