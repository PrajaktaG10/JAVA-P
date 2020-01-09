package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
        driver.findElement(By.name("email")).sendKeys("patil.prajakta93@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("prasad55");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.className("_54ni navSubmenu _6398 _64kz __MenuItem")).click();
	}

}
