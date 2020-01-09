package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.findElement(By.linkText("Gmail")).click();
      //driver.findElement(By.partialLinkText("Gm")).click();
      

	}

}
