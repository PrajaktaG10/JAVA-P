//POM:Page Object Model
package pomTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageFactory.RediffLoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class RediffLoginPageTest2 {
	private WebDriver driver;
	private RediffLoginPage rlp;
  @Test
  public void checkAlert() {
	  rlp.setUname("seed");
	  rlp.clickOnGo();
	  rlp.validateAlert();
  }
  @Test
  public void checkStatus(){
	  rlp.checkStatusofcb();
  }
  @Test
  public void checkCreateAcLink(){
	  rlp.newAccount();
	  System.out.println("Title: "+driver.getTitle());
	  System.out.println("URL: "+driver.getCurrentUrl());
	  driver.navigate().back();
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

	  driver = new ChromeDriver();
	 // System.setProperty("webdriver.chrome.driver", "G:\\New folder\\chromedriver.exe");
	  //driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  rlp = new RediffLoginPage(driver);
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
