package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//write a script to read the data from the Excel File.
public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get the java representative object of the physical file.
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//create the workbook or open the Excel in read mode.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row,then cell and then read the data.
		
		//String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).toString();
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		//print the data on console.
		System.out.println(data);
	}
}
