package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadWriteData {
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath="F:\\Selenium\\Excel\\MyExcel.xls";
	String data, shName;
	int row=0, col=0;
	
  @Test
  public void f() {
	  rw=sh.getRow(row);
	  cl=rw.getCell(col);
	  data=cl.getStringCellValue();
	  System.out.println(data);
	 
	  rw=sh.createRow(row);
	  cl=rw.createCell(col+1);
	  cl.setCellValue(data);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  file=new File(fpath);
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  shName=wb.getSheetName(0);
	  sh=wb.getSheet(shName);
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
     wb.close();
     fos.close();
     fis.close();
     
  
  }

}
