package webElement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.id("SPBApplyBtn")).click();
        Set<String> winIds= driver.getWindowHandles();
        Iterator<String> itr= winIds.iterator();
        String win1=itr.next();
        String win2=itr.next();
        driver.switchTo().window(win2);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("filCV")).sendKeys("F:\\Testing types.txt");
        driver.switchTo().window(win1);
        System.out.println(driver.getTitle());
        driver.quit();
        
        
        
        
        
        
        
	}

}
