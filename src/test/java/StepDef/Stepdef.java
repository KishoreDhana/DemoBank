package StepDef;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdef 
{
	WebDriver driver=null;
	
	
public static void main(String[] args) throws Exception{
		
		
		// create file input stream object for the excel sheet
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
		// create object for work book
		Workbook wb = WorkbookFactory.create(fis);
		//create object for sheet present in excel using Workbook object 'wb'
		Sheet sheet = wb.getSheet("TestData");
		//create object for row present in sheet using Sheet object 'sheet'
		Row row = sheet.getRow(1);
		//create object for cell present in row using Row object 'row'
		Cell cell = row.getCell(0);
		String FirstName=cell.getStringCellValue();
		System.out.println(cell.getStringCellValue());
		
		
		Sheet sheet1 = wb.getSheet("TestData");
		//create object for row present in sheet using Sheet object 'sheet'
		Row row1 = sheet1.getRow(1);
		//create object for cell present in row using Row object 'row'
		Cell cell1 = row1.getCell(1);
		String LastName=cell1.getStringCellValue();
		System.out.println(cell.getStringCellValue());
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	
		driver.get("http://demo.rapidtestpro.com/register.php#");
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("phone")).sendKeys("9898989898");
		
	}
		
}
