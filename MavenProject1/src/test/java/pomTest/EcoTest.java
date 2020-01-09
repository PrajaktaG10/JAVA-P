package pomTest;

import org.testng.annotations.Test;

import pOMpage.EchoTrakLoginPAge;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class EcoTest {
	WebDriver driver;
	EchoTrakLoginPAge elp;
	
  @Test
  public void checkAlert() {
	  elp.setUserName("seed");
	  elp.setPassword("s");
	  elp.clickLogin();
	  elp.validateErrMsg();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  elp = new EchoTrakLoginPAge(driver);
  }

  @AfterTest
  public void afterTest() {
  driver.close();
  }

}
