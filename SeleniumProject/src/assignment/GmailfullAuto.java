package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailfullAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("gotheprajakta10");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prajakta10");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id(":pi")).sendKeys("patil.prajakta93@gmail.com");
        driver.findElement(By.id(":p0")).sendKeys("Automated mail"); 
        driver.findElement(By.xpath("//*[@id=\":q5\"]")).sendKeys("Hello"); 
        driver.findElement(By.xpath ("//*[@id=':oq']")).click();
        driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnu']//div[@class='aio UKr6le']")).click();
        Thread.sleep(4000);
        driver.close();		  
	}

}
