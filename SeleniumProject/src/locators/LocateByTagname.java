package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagname {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
   List<WebElement> links=driver.findElements(By.tagName("a"));
   for(WebElement w:links)
	   System.out.println(w.getText());
	}

}
