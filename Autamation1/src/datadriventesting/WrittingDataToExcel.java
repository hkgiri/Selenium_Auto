package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//write a program to write the data back to Excel File.
public class WrittingDataToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get the java representative object object of the physical file.
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//create the workbook or open the Excel in read mode.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row, then cell and then type the data.
		wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("true");
		//get the physical file of the java representative object type.
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		//save the workbook actual writing happens here.
		wb.write(fos);
		
	}
}
