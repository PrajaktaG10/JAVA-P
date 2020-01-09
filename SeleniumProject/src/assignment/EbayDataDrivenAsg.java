package assignment;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EbayDataDrivenAsg {
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	WebDriver driver;
	int rCount, cCount, row, col, i=1, j=3, k=4;
	String shName, act;
	
  @Test(dataProvider = "getData")
  public void f( String un, String pwd, String exp) throws Exception {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	  driver.findElement(By.id("userid")).sendKeys(un);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
	  driver.findElement(By.id("sgnBt")).click();
	  act=driver.findElement(By.xpath("//p[@id='errf']")).getText();
	  fos=new FileOutputStream(file);
	  rw=sh.getRow(i);
	  cl=rw.createCell(j);
	  cl.setCellValue(act);
	  cl=rw.createCell(k);
	  if(act.equals(exp))
	  {
		  cl.setCellValue("Pass");
	  }
	  else
	  {
		  cl.setCellValue("Fail");;
	  }
	  i++;
	  wb.write(fos);
	  fos.close();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("userid")).clear();
	 
  }
  @DataProvider
  public Object[][] getData() {
   rCount=sh.getPhysicalNumberOfRows();
   cCount=sh.getRow(0).getPhysicalNumberOfCells();
   Object[][] data=new Object[rCount-1][cCount-2];
   for(row=0; row<rCount-1; row++) {
	  rw=sh.getRow(row+1);
	  for(col=0; col<cCount-2; col++) {
		  cl=rw.getCell(col);
		  data[row][col]=cl.getStringCellValue();
	  }
   }
	return data;	   
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  file=new File("F:\\ebayProjectLevelAssignments.xls");
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shName=wb.getSheetName(1);
	  sh=wb.getSheet(shName);
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://in.ebay.com/");  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  driver.close();
	  wb.close();
	  fis.close();
  }
}
