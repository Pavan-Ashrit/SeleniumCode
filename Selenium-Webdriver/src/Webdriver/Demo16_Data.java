package Webdriver;


import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo16_Data {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		//Jxl -- Supports Xls
		//Apache POI -- Excel Format,XLSX
		
		//Create a file
		File fexcel = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Excel\\newdemo.xls");
		//Create a workbook in excel file
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		//Create a sheet with sheet name
		writebook.createSheet("Training",0);		
		WritableSheet writesheet = writebook.getSheet(0);
		Label testdata1 = new Label(0,0,"Pavan");
		writesheet.addCell(testdata1);
		//Add one more data
		Label testdata2 = new Label(0,1,"Ashrit");
		writesheet.addCell(testdata2);
		
		//Create one more sheet in same workbook and add data to the 5th row
		
		writebook.createSheet("SecondSheet", 1);
		WritableSheet writesheet1 = writebook.getSheet(1);
		Label testdata3 = new Label(0,4,"5th Row Data");
		writesheet1.addCell(testdata3);
		
		writebook.write();
		writebook.close();
	}

}
