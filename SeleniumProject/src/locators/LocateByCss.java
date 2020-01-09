package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Good morning");
       //driver.findElement(By.cssSelector("input[title='Search'][role='combobox']")).sendKeys("Good morning");//find by using multiple attributes
        //driver.findElement(By.cssSelector("input[title^='Se']")).sendKeys("Good morning");// find by some starting letter
        //driver.findElement(By.cssSelector("input[title$='rch']")).sendKeys("Good morning");  //find by ending letter
        driver.findElement(By.cssSelector("input[title*='ar']")).sendKeys("Good morning");  // find by middle letter
        
	}

}