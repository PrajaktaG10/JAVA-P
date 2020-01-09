package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadDataFromExTest {
	File file;
	FileInputStream fis;
	HSSFWorkbook wb;
	 HSSFSheet sh;
	  HSSFCell cl;
	  HSSFRow rw;
	  String data,shnm;
	  String fpath="F:\\Selenium\\Excel\\MyExcel.xls";
	
	
  @Test
  public void f() {
	  rw=sh.getRow(0);
	  cl=rw.getCell(0);
	  data=cl.getStringCellValue();
	  System.out.print(data);
	}
  @BeforeTest
  public void beforeTest() throws Exception {
	  file=new File(fpath);
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shnm=wb.getSheetName(0);
	  sh=wb.getSheet(shnm); 
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
	  
  }

}
