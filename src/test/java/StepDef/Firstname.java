package StepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellUtil;

public class Firstname {
	
	public  void GetFirstName() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("TestData");
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		String FirstName=cell.getStringCellValue();
		System.out.println(cell.getStringCellValue());
	}
	
	public  void GetLastName() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet("TestData");
		
		Row row1 = sheet1.getRow(1);
		
		Cell cell1 = row1.getCell(1);
		String LastName=cell1.getStringCellValue();
		System.out.println(cell1.getStringCellValue());
		
	}

}
