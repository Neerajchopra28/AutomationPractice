package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	//Function to get any value from Config File
	public static String getConfigValue(String arg) throws IOException {

		String value = "";
		try {
			Properties prop = new Properties();
			FileReader file = new FileReader(System.getProperty("user.dir") + "\\config.properties");
			prop.load(file);
			value = prop.getProperty(arg);
		} catch (Exception e) {
			System.out.println("Unable to read Config file  " + e);
		}
		return value;

	}
	
	
		
	
	//Function to Handle Explicit wait
		public static boolean explicitWait(WebElement element, WebDriver driver) throws IOException {
			try {
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOf(element));
			
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}

		
	
}