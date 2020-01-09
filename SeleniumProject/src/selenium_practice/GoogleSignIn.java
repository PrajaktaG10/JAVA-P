package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("html/body/div/div[3]/div/div/div/div[2]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//h1[@id='headingText']")).getText());
	   driver.findElement(By.xpath("//*[@id='yDmH0d']")).sendKeys("gotheprajakta10@gmail.com");
	    /*Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Prajakta10");
	    driver.findElement(By.xpath("//*[@id='yDmH0d']")).click();*/
	}

}
