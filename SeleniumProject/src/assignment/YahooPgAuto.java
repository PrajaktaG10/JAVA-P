package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooPgAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Prajakta");
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Gothe");
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("prajaktagothe");
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("p123456789");
		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("7276315818");
		WebElement bmonth=driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		Select bmnth=new Select(bmonth);
		List<WebElement> bmonths=bmnth.getOptions();
		bmnth.selectByVisibleText("December");
		driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1993");
		driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys("Female");
		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
	}

}
