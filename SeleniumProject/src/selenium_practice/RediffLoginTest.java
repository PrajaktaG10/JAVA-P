package selenium_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RediffLoginTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  driver.findElement(By.id("login1")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.id("remember")).click();
	  driver.findElement(By.name("proceed")).click();
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  //driver.switchTo().defaultContent();
	   
	  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("username")).clear();  
	  driver.findElement(By.name("remember")).click();
  }
	  /*List<WebElement> li= driver.findElements(By.name("remember"));
	   for(WebElement w:li)
	   {
		   if(w.isEnabled())
			   w.click();
		   }
  }*/

  @DataProvider
  public Object[][] dp() {
	  Object [][] data=new Object[3][2];
      data[0][0]="Prajakta";
      data[0][1]="Prajakta";
      data[1][0]="Pooja";
      data[1][1]="Pooja";
      data[2][0]="Dhanshree";
      data[2][1]="Dhanshree";
	  return data;
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
      driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
