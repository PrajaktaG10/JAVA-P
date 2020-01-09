package asgTestCases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
		driver.get("https://in.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("gh-as-a")).click();
		driver.findElement(By.id("_nkw")).sendKeys("Watch");
		driver.findElement(By.id("_ex_kw")).sendKeys("Camera");
		WebElement catgry=driver.findElement(By.xpath("//*[@id='e1-1']"));
		Select category=new Select(catgry);
		List <WebElement> categories=category.getOptions();
		category.selectByVisibleText("Jewelry & Watches");
		List<WebElement> s = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/label/input[1]"));
		for(WebElement w:s)
		{
				if(w.isEnabled())
				 {
					w.click();
				 }
		}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
	    List<WebElement> p=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[3]/input[1]"));
	    for(WebElement w:p)
	    	if(w.isEnabled())
	    	   w.click();
	    driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys("1000");
	    driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys("10000");
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
	    List<WebElement> bf=driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[4]/label[1]/input[1]"));
	    for(WebElement w:bf)
	    	  if(w.isEnabled())
	    		  w.click();  
	   List <WebElement> con =driver.findElements(By.xpath("//input[@id='LH_ItemConditionNew']"));
	   for(WebElement w:con)
	    	  if(w.isEnabled())
	    		  w.click();
	   List<WebElement> sr=driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[6]/div[1]/input[1]"));
	   for(WebElement w:sr)
	    	  if(w.isEnabled())
	    		  w.click();
	   WebElement listng=driver.findElement(By.xpath("//select[@name='_ftrt']"));
	   Select listing=new Select(listng);
	   List<WebElement> listings=listing.getOptions();
	   listing.selectByVisibleText("Started within");
	   WebElement dy=driver.findElement(By.xpath("//select[@name='_ftrv']"));
	   Select day=new Select(dy);
	   List<WebElement> days=day.getOptions();
	   day.selectByVisibleText("7 days");
	   List<WebElement> re=driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[6]/label/input[1]"));
	   int j=1;
	   for(WebElement w:re)
	    	  if(w.isEnabled())
	    		  w.click();
	               j++;
	   List<WebElement> so=driver.findElements(By.xpath("//input[@id='LH_FS']"));
	   for(WebElement w:so)
	    	  if(w.isEnabled())
	    		  w.click();
	   List<WebElement> sit=driver.findElements(By.xpath("//input[@id='_fss']"));
	   for(WebElement w:sit)
	    	  if(w.isEnabled())
	    		  w.click();
	   List<WebElement> lin=driver.findElements(By.xpath("//input[@id='LH_LocatedInRadio']"));
	   for(WebElement w:lin)
	    	  if(w.isEnabled())
	    		  w.click();
	   WebElement lctedin=driver.findElement(By.xpath("//select[@id='_salicSelect']"));
		Select located=new Select(lctedin);
		List <WebElement> locatedin=located.getOptions();
		located.selectByVisibleText("India");
		 WebElement itm=driver.findElement(By.xpath("//select[@id='LH_IPP']"));
			Select items=new Select(itm);
			List <WebElement> itemsperpg=items.getOptions();
			items.selectByVisibleText("200");
			driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
			Thread.sleep(10000);
		   driver.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
			   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	

	
