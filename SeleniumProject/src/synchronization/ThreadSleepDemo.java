package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li[5]/div/div[2]/div/span/b")).click();

	}

}
