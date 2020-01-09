package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement contry=driver.findElement(By.id("country"));
		Select nation=new Select(contry);
		System.out.println("Default selected country is "+nation.getFirstSelectedOption().getText());
		List<WebElement> countries=nation.getOptions();
        System.out.println("Total countries are "+countries.size());
        WebElement cty=driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		Select city=new Select(cty);
		System.out.println("Default selected city is "+city.getFirstSelectedOption().getText());
		city.selectByVisibleText("Pune");
		System.out.println("selected city is "+city.getFirstSelectedOption().getText());
		List<WebElement> cities=city.getOptions();
        for(WebElement w:cities)
              System.out.println(w.getText());
        System.out.println("Total cities are "+cities.size());
	}

}
