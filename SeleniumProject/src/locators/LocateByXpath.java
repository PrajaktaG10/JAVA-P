package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hi..");
	}

}
