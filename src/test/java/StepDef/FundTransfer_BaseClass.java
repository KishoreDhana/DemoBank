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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FundTransfer_BaseClass
{
	static WebDriver driver;
	
	public static void Initiating_browser()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\driver\\chromedriver.exe");
			
		 driver=new ChromeDriver();
		driver.get("http://demo.rapidtestpro.com/login.php");
	 }
	
	public static void login() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Login_Credentials");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String Username=cell.getStringCellValue();
		driver.findElement(By.name("accno")).sendKeys(Username);
		
		Sheet sheet1 = wb.getSheet("Login_Credentials");
		Row row1 = sheet1.getRow(0);
		Cell cell1 = row1.getCell(1);
		String Password=cell1.getStringCellValue();
		driver.findElement(By.name("pass")).sendKeys(Password);
		System.out.println(Password);
		driver.findElement(By.name("submitButton")).click();
		
		Sheet sheet2 = wb.getSheet("Login_Credentials");
		Row row2 = sheet2.getRow(0);
		Cell cell2 = row2.getCell(2);
		String Pin_no=cell2.getStringCellValue();
		driver.findElement(By.name("accpin")).sendKeys(Pin_no);
		driver.findElement(By.name("submitButton")).click();
	}
	
	public static void Click_FT() 
	{
		driver.findElement(By.linkText("Fund Transfers")).click();
		
	}
	
	public static void Fill_details() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Fund_Transfer");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String Receiver_Bank_Name=cell.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='rbname']")).sendKeys(Receiver_Bank_Name);
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("Fund_Transfer");
		Row row1 = sheet1.getRow(0);
		Cell cell1 = row1.getCell(1);
		String Receiver_Name=cell1.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='rname']")).sendKeys(Receiver_Name);
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("Fund_Transfer");
		Row row2 = sheet2.getRow(0);
		Cell cell2 = row2.getCell(2);
		String Receiver_Account_Number=cell2.getStringCellValue();
		driver.findElement(By.id("accno")).sendKeys(Receiver_Account_Number);
		
		FileInputStream fis3 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb3 = WorkbookFactory.create(fis3);
		Sheet sheet3 = wb3.getSheet("Fund_Transfer");
		Row row3 = sheet3.getRow(0);
		Cell cell3 = row3.getCell(3);
		String SWIFT=cell3.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='swift']")).sendKeys(SWIFT);

		FileInputStream fis4 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb4 = WorkbookFactory.create(fis4);
		Sheet sheet4 = wb4.getSheet("Fund_Transfer");
		Row row4 = sheet4.getRow(0);
		Cell cell4 = row4.getCell(4);
		String Amount=cell4.getStringCellValue();
		driver.findElement(By.id("amt")).sendKeys(Amount);

		WebElement fto = driver.findElement(By.xpath("//select[@id='toption']"));
		fto.click();
		
		Select element = new Select(fto);
		element.selectByVisibleText("International Transfer");
		
		FileInputStream fis5 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb5 = WorkbookFactory.create(fis5);
		Sheet sheet5 = wb5.getSheet("Fund_Transfer");
		Row row5 = sheet5.getRow(0);
		Cell cell5 = row5.getCell(5);
		String Date=cell5.getStringCellValue();
		driver.findElement(By.xpath(" //input[@id='dot']")).sendKeys(Date);
		
		
		FileInputStream fis6 = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb6 = WorkbookFactory.create(fis6);
		Sheet sheet6 = wb6.getSheet("Fund_Transfer");
		Row row6 = sheet6.getRow(0);
		Cell cell6 = row6.getCell(6);
		String Description=cell6.getStringCellValue();
		driver.findElement(By.xpath(" //textarea[@id='desc']")).sendKeys(Description);
		driver.findElement(By.name("submitButton")).click();
	}
	
	public static void PIN() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\Ft_TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Fund_Transfer");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(7);
		String PIN=cell.getStringCellValue();
		driver.findElement(By.name("token")).sendKeys(PIN);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	public static void User_Logout() throws Exception
	{
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
	}
}
