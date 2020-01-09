package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi TV");//This will find element find by id locator
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mi mobile");// This will find element by xpath
		driver.findElement(By.cssSelector("input[tabindex='9']")).sendKeys("Body massager");//This will find element by using cssselector locator
		driver.findElement(By.className("nav-input")).click();//This will find element by class name locator
	}

}
