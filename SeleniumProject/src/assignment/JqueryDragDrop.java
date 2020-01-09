package assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class JqueryDragDrop {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement drop=driver.findElement(By.linkText("Droppable"));
	Actions action=new Actions(driver);
	 /* action.contextClick(drop).sendKeys(Keys.CONTROL).sendKeys(Keys.ENTER).
			  sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
	  .sendKeys(Keys.RETURN).build().perform();*/
	  drop.sendKeys(Keys.chord(Keys.SHIFT, Keys.ENTER));
	  Set<String> winIds= driver.getWindowHandles();
      Iterator<String> itr= winIds.iterator();
      String win1=itr.next();
      String win2=itr.next();
      driver.switchTo().window(win2);
	  
	  
	  Thread.sleep(4000);
	  WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDropBy(source, target.getLocation().getX(), target.getLocation().getY()).perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://jqueryui.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
            driver.close();
  }
}
