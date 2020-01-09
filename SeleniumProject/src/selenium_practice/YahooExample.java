package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
        Thread.sleep(2000);
        WebElement w= driver.findElement(By.xpath("//*[@id='login-username-form']/p[2]/span[1]/label"));
        if(w.isEnabled())
        {
        	System.out.println("Status of check box is "+w.isSelected());
           w.click();
           System.out.println("After click, status of checkbox is "+w.isSelected());
        }
	}

}
