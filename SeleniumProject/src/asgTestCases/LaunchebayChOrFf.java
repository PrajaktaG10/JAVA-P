package asgTestCases;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchebayChOrFf {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the choice of browser to launch");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
	    int ch=in.nextInt();
        switch(ch) 
          {
             case 1:
            	 System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
         		WebDriver driver=new ChromeDriver();
         		driver.get("https://in.ebay.com/");
         		break;
    
             case 2:	
         		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        	    driver =new FirefoxDriver();
        		driver.get("https://in.ebay.com/");
        		break;
            	 
        		default:
        			System.out.println("Enter valid browser choice");
        			break;
          }
		

	}

}
