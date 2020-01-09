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

public class ExcelAssignment {
	File file;
	String fpath="F:\\Selenium\\Excel\\ExcelAssignment.xls";
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	FileOutputStream fos;
	
	
  @Test
  public void f() {
	  sh=wb.createSheet();
	  for(int i=0; i<=2;i++)
	    {
	      rw=sh.createRow(i);
	      for(int j=0; j<=2; j++)
	        {
	    	  cl=rw.createCell(j);
	    	  cl.setCellValue("row "+i+" column "+j);
	      }
	  }
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new HSSFWorkbook();
  }

  @AfterTest
  public void afterTest() throws IOException {
	  System.out.println("Excel file created successfully.");
	 wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
