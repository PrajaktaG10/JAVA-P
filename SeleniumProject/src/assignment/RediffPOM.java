package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RediffPOM {
      By name= By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]");
      By userName= By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]");
      By password=By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input");
      By retype_Password= By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input");
      By email= By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[14]/td[1]/"
      		+ "div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]");
      By mobile=By.xpath("//input[@id='mobno']");
      By day=By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]");
      By month=By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]");
      By year=By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]");
      By gender=By.name("genderb01e1a35");
      By city=By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select");
      By register=By.xpath("//input[@id='Register']");
      WebDriver driver;
      
      public RediffPOM(WebDriver driver) {
    	  this.driver=driver;
      }
      public void setname(String nm) {
    	  driver.findElement(name).sendKeys(nm);
      }
      public void setuserName(String un) {
    	  driver.findElement(userName).sendKeys(un);
      }
      public void setpassword(String pwd) {
    	  driver.findElement(password).sendKeys(pwd);
      }
	  public void setretype_Password(String rpwd) {
		  driver.findElement(retype_Password).sendKeys(rpwd);
	  }
      public void setemail(String em) {
    	  driver.findElement(email).sendKeys(em);
      }
      public void setmobile(String mb) {
    	  driver.findElement(mobile).sendKeys(mb);
      }
      public void setday(String dAy) {
    	  WebElement dy=driver.findElement(day);
    	  Select day=new Select(dy);
  		List<WebElement> days=day.getOptions();	
  		day.selectByVisibleText(dAy);
      }
      public void setmonth(String mnTh) {
    	  WebElement mnth=driver.findElement(month);
    	  Select month=new Select(mnth);
  		List<WebElement> months=month.getOptions();
  		month.selectByVisibleText(mnTh);
      }
      public void setyear(String yR) {
    	  WebElement yr=driver.findElement(year);
    	  Select year=new Select(yr);
  		List<WebElement> years=year.getOptions();
  		year.selectByVisibleText(yR);
      }
  		public void setgender(String gnder) {
  			List<WebElement> gen=driver.findElements(gender);
  			for(WebElement w:gen) {
  	        if(w.isEnabled())
  	        	{
  	        	  w.click();
  	        	}
  			}
  		}
  		public void setcity(String cty) {
  			WebElement ciTy=driver.findElement(city);
      	  Select cIty=new Select(ciTy);
    		List<WebElement> cities=cIty.getOptions();	
    		cIty.selectByVisibleText(cty);
  		}
      
    public void clickOnregister() {
    	driver.findElement(register).click();
    }
}



