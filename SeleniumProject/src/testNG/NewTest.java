package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");
	  
  }
}
