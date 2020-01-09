package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> cb=driver.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input"));
		for(WebElement w:cb) {
        if(w.isEnabled())
        	{
        	  System.out.println("Default Status of radio button "+w.getAttribute("value")+" is "+w.isSelected());
              w.click();
              System.out.println("After click Status of radio button "+w.getAttribute("value")+" is "+w.isSelected());
        	}	
		}
	}

}