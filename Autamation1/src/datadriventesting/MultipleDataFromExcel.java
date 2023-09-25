package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//write a program to read multiple data from the Excel File.
public class MultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the last row number which contains data.
		int count = wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=1;i<=count;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(2).getStringCellValue();
		System.out.println(un+"  "+pw);
		}
	}
}
