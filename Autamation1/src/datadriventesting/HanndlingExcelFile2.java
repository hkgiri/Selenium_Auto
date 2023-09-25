package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Another way to Reading the data from Excel File.
public class HanndlingExcelFile2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet.
		Sheet s = wb.getSheet("CreateCustomer");
		//get the control of the row.
		Row r = s.getRow(1);
		//get the control of the cell.
		Cell c = r.getCell(2);
		String v = c.getStringCellValue();
		System.out.println(v);
	}
}
