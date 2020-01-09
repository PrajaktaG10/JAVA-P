package webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String expMsg="Please enter a valid user name";
		driver.findElement(By.name("proceed")).click();
		Alert a=driver.switchTo().alert();
		String errMsg= a.getText();
		if(errMsg.equals(expMsg))
			System.out.println("Same as expected: "+errMsg);
		else
			System.out.println("Error message is Not same as expected: "+errMsg);
		//System.out.println("Error message: "+errMsg);
		a.accept();
		driver.switchTo().defaultContent();
		driver.close();
		
		

	}

}