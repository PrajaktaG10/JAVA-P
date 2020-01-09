package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class NewTest {
	File file;
	  String fpath="F:\\Selenium\\Excel\\EmpDetails.xls";
	  FileOutputStream fos;
	  HSSFWorkbook w;
	  HSSFSheet s;
	  HSSFRow r;
	  HSSFCell c;
	  int row=0, col;
	
  @Test(dataProvider="getData")//Always provide dataprovider name 
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

  @DataProvider
  public Object[][] getData() {
     Object[][] data=new Object[3][3];
        
    	 data[0][0]="Name";
    	 data[0][1]="Company";
    	 data[0][2]="Location";
    	 
    	 data[1][0]="Diwaakar";
    	 data[1][1]="HSBC";
    	 data[1][2]="Mumbai";
    	 
    	 data[2][0]="Pravin";
    	 data[2][1]="Asus";
    	 data[2][2]="Pune";
    			 return data;
    			 
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  w=new HSSFWorkbook();
	  s=w.createSheet();
	
	  
	  
  }
  

  @AfterTest
  public void afterTest() throws IOException {
  w.write(fos);
  w.close();
  fos.close();
  System.out.println("Done...!!");
 
  }

}
