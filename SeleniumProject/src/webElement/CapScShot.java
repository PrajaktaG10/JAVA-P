package webElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapScShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot scrShot=((TakesScreenshot)driver);//TakesScreenshot interface
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File desFile=new File("F:\\Selenium\\homepage.png");
		FileUtils.copyFile(srcFile, desFile);
	}
}
