package Webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fexcel = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Excel\\TestData.xlsx");
		//openit
		FileInputStream fis =  new FileInputStream(fexcel);
		//Interface of Apache POI...xssf(interface) is used to work with xlsx format..hssf is used to work with xls format
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		for (int i=0;i<=rowcount;i++)
		{
			int colcount = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<colcount;j++)
			{
				System.out.println("value of i"+ i +"value of j" +j+ sheet.getRow(i).getCell(j).getStringCellValue() );
				
			}
			
			wb.close();
		}
		
	}

}
