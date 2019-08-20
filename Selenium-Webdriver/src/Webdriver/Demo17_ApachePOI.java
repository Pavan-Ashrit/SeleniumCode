package Webdriver;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo17_ApachePOI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//
		//access the excel file
		File fexcel = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Excel\\TestData.xlsx");
		//openit
		FileInputStream fis =  new FileInputStream(fexcel);
		//Interface of Apache POI...xssf(interface) is used to work with xlsx format..hssf is used to work with xls format
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//open the sheet in excel file
		XSSFSheet sheet = wb.getSheetAt(0);
		String Data1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data in the 0th row and 0th column" + Data1);
		String Data2 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data in the 0th row and second column"+Data2);
		
		wb.close();
		
		
		
		
		
	}

}
