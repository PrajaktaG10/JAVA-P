package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement w=driver.findElement(By.name("q"));
	w.sendKeys("Testing");
     //driver.findElement(by.name("q")).sendKeys("testing");-----Findelement will return the web element. sendkeys is method of web element.
	}

}
