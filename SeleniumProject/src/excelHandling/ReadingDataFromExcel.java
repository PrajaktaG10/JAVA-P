package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadingDataFromExcel {
  
	@Test(dataprovider="getData")
  public void writeDataToExcel(String nm, String cm, String loc) {
		col=0;
		
		r=s.createRow(row);
		
		c=r.createCell(col);
		c.setCellValue(nm);
		
		c=r.createCell(col+1);
		c.setCellValue(cm);
		
		c=r.createCell(col+2);
		c.setCellValue(loc);
	  
		row++;
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
