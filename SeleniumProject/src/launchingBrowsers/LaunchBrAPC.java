package launchingBrowsers;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchBrAPC {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Browser of your choice");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
		System.out.println("3.Internet Explorer");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.google.com/");
			break;
		case 3:
			System.setProperty("webdriver.ie.driver", "F:\\Selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("https://www.google.com/");
			break;
		}
		

	}

}
