package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAS2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dy=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dy);
		List<WebElement> days=day.getOptions();
		System.out.println("Default selected day is "+day.getFirstSelectedOption().getText());
		day.selectByVisibleText("10");
		System.out.println("Selected day is "+day.getFirstSelectedOption().getText());
		
		System.out.println();
		
		WebElement mnth=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(mnth);
		List<WebElement> months=month.getOptions();
		System.out.println("Default selected month is "+month.getFirstSelectedOption().getText());
		month.selectByVisibleText("DEC");
		System.out.println("Selected month is "+month.getFirstSelectedOption().getText());
		
		System.out.println();
		
		WebElement yr=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		//Thread.sleep(2000);
		Select year=new Select(yr);
		List<WebElement> years=year.getOptions();
		System.out.println("Default selected year is "+year.getFirstSelectedOption().getText());
		year.selectByVisibleText("1993");
		System.out.println("Selected year is "+year.getFirstSelectedOption().getText());
		System.out.println();
		System.out.println("Selected Date of Birth is "+day.getFirstSelectedOption().getText()+"/"+month.getFirstSelectedOption().getText()+"/"+year.getFirstSelectedOption().getText());
 }
}
