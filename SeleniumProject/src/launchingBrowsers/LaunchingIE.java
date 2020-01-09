package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		

	}

}
