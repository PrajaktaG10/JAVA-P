package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello");
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(driver);
		fw.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofNanos(1))
		.ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div/span/b"))).click();
		

	}

}