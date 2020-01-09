package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffPgFulAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]")).sendKeys("Prajakta Gothe");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("gotheprajakta");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("p123456");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("p123456");
		driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[14]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).sendKeys("gotheprajakta10@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("7276315818");
		WebElement dy=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dy);
		List<WebElement> days=day.getOptions();		
		day.selectByVisibleText("10");
		WebElement mnth=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(mnth);
		List<WebElement> months=month.getOptions();
		month.selectByVisibleText("DEC");
		WebElement yr=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yr);
		List<WebElement> years=year.getOptions();
		year.selectByVisibleText("1993");
		List<WebElement> c=driver.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input"));
		for(WebElement w:c)
		{
		if(w.isEnabled()) 
		     {
			w.click();
	            }
	       }
		WebElement cntry=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(cntry);
		List<WebElement> countries=country.getOptions();
		country.selectByVisibleText("India");
		WebElement cty=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[28]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/select[1]"));
		Select city=new Select(cty);
		List<WebElement> cities=city.getOptions();
		city.selectByVisibleText("Pune");
		driver.findElement(By.xpath("//input[@id='Register']")).click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		//driver.close();
	}
}
