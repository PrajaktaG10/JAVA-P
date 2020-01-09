package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class ReadData {
	File file;
	HSSFWorkbook wb;
	  String fpath="F:\\Selenium\\Excel\\EmpDetails.xls";
	  FileInputStream fis;
	  HSSFSheet sh;
	  HSSFCell cl;
	  HSSFRow rw;
	  String shnm,data;
	  int rowCount, colCount, row, col;
  @Test
  public void ReadFromExcel() {
	  rowCount=sh.getPhysicalNumberOfRows();
	  colCount=sh.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Row count: "+rowCount+ "\tColumn count "+colCount);
	  for(row=0; row<rowCount; row++)
	  {
		  rw=sh.getRow(row);
		  for(col=0; col<colCount; col++)
		  {
			  cl=rw.getCell(col);
			  data=cl.getStringCellValue();
			  System.out.print(data+"\t");
		  }
		  System.out.println();
	  }
  }


  @BeforeTest
  public void beforeTest() throws IOException {
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
