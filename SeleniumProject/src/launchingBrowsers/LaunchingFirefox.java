package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
