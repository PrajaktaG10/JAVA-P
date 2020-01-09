package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ExTest2 {
	File file;
	String fpath="F:\\Selenium\\Excel\\ExcelTest.xls";
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	
  @Test
  public void f() {
	 sh=wb.createSheet();
	 rw=sh.createRow(0);
	 cl=rw.createCell(0);
	 cl.setCellValue("Cell value");
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new HSSFWorkbook();
  }

  @AfterTest
  public void afterTest() throws IOException {
	  System.out.println("Excel file created successfully");
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
