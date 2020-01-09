package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateIdLtPlt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
                 driver.findElement(By.id("login1")).sendKeys("Prajakta");
		driver.findElement(By.id("password")).sendKeys("praj");
		driver.get("https://www.google.com/");
		
		
	}

}
