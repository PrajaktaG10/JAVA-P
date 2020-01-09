package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();
	
	
	}

}
