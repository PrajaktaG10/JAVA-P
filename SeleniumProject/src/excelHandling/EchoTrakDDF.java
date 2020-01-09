package excelHandling;

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

public class EchoTrakDDF {
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	WebDriver driver;
	String exp="Invalid Username/Password", act, shnm;
	int rowCount, colCount, row, col, i=1, j=2;
	
  @Test(dataProvider = "getData")
  public void EchoTrakLogin(String un, String pwd) throws Exception {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("txtCustomerID")).sendKeys(un);
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("Butsub")).click();
	  act=driver.findElement(By.id("lblMsg")).getText();
	  fos=new FileOutputStream(file);
	  rw=sh.getRow(i);
	  cl=rw.createCell(j);
	  
	  if(act.equals(exp))
	  {
		  cl.setCellValue("Pass");
	  }
	  else
	  {
		cl.setCellValue("Fail");  
	  }
	  i++;
	  wb.write(fos);
	  fos.close();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("txtCustomerID")).clear();
	  driver.findElement(By.id("txtPassword")).clear();  
  }

  @DataProvider
  public Object[][] getData() {
	  rowCount=sh.getPhysicalNumberOfRows();
	  colCount=sh.getRow(0).getPhysicalNumberOfCells();
	  Object[][] data=new Object[rowCount-1][colCount-1];
	  for(row=0; row<rowCount-1; row++ ) {
		  rw=sh.getRow(row+1);
		  for(col=0; col<colCount-1; col++) {
			  cl=rw.getCell(col);
			  data[row][col]=cl.getStringCellValue();
		  }
	  }
	  return data;  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  file=new File("F:\\Selenium\\Excel\\Details.xls");
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shnm=wb.getSheetName(0);
	  sh=wb.getSheet(shnm);
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.echotrak.com");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  driver.close();
	  wb.close();
	  fis.close();
  }
}
