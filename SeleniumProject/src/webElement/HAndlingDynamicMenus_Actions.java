package webElement;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HAndlingDynamicMenus_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://istqb.in/");
		WebElement foundation=driver.findElement(By.xpath("//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(foundation).perform();
		List<WebElement> options=driver.findElements(By.xpath("//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[1]/ul/li/a"));
		for(WebElement w:options)
			System.out.println(w.getText());
		
		
		//To choose any random option
		/*Random r= new Random();
		int x= r.nextInt(options.size());
		options.get(x).click();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS );
		System.out.println("Current page title is : "+driver.getTitle());*/
		
		
	}

}
