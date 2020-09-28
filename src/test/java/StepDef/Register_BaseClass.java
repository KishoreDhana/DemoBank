package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.Iterable;
import java.text.DecimalFormat;


public class Register_BaseClass 
{
	 static WebDriver obj;
	 
	 public static void Browser()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\driver\\chromedriver.exe");
			
		 obj=new ChromeDriver();
		obj.get("http://demo.rapidtestpro.com/login.php");
		System.out.println("Welcome to index screen");
		obj.findElement(By.linkText("Register it Now")).click();
	 }
	 
	 public static void gender()
	 {
		 Select Gender =new Select(obj.findElement(By.id("gender")));
			Gender.selectByVisibleText("Male");
			
	 }
	 
	 public static void AccTyp()
	 {
		 Select AccTyp =new Select(obj.findElement(By.id("acctype")));
		 AccTyp.selectByVisibleText("Saving Account");
	 }
	 
	 
 public static void Fname() throws Exception
 
 {
			FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("TestData");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String FirstName=cell.getStringCellValue();
			System.out.println("Firstname is :" +FirstName);
			obj.findElement(By.name("firstname")).sendKeys(FirstName);
			//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
 }
 
public static void Lname() throws Exception
 
 {
			FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("TestData");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);
			String LastName=cell.getStringCellValue();
			System.out.println("Lastname is :" +LastName);
			obj.findElement(By.name("lastname")).sendKeys(LastName);
 }
public static void Password() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(2)	;
	String Password=cell.getStringCellValue();
	System.out.println("Password is : " +Password);
	obj.findElement(By.name("password")).sendKeys(Password);
}
public static void Cn_Password() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(3);
	String Cn_Password=cell.getStringCellValue();
	System.out.println("Conform Password is : " +Cn_Password);
	obj.findElement(By.name("cpassword")).sendKeys(Cn_Password);

}
public static void Email_ID() throws Exception
{
	
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(4);
	String Email_ID=cell.getStringCellValue();
	//RichTextString Email_ID=cell.getRichStringCellValue();
	System.out.println("Email Id is :"+Email_ID);
   obj.findElement(By.name("email")).sendKeys(Email_ID);
	

}


public static void Phone_Number() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	String cell = row.getCell(5).toString();
	//String Phone_Number=cell.getStringCellValue();
	//String kk= (cell).getStringCellValue();
	//System.out.println("Phone Number" +cell);
	System.out.println("Phone number :" +cell);
	obj.findElement(By.name("phone")).sendKeys(cell);
	

}
public static void DOB() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	String cell = row.getCell(6).toString();
	//String DOB=cell.getStringCellValue();
	//cell.getDateCellValue();
	//System.out.println("DOB"+cell.getDateCellValue());
	//String DOB=cell.getDateCellValue().toString();
	System.out.println("DOB :" +cell);
	obj.findElement(By.name("dob")).sendKeys(cell);

}

public static void Address() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(7);
	String Address=cell.getStringCellValue();
	System.out.println("Address : " +Address);
	obj.findElement(By.name("address")).sendKeys(Address);

}

public static void City_name() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(8);
	String City_name=cell.getStringCellValue();
	System.out.println("City name :" +City_name);
	obj.findElement(By.name("city")).sendKeys(City_name);

}
public static void State() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(9);
	String State=cell.getStringCellValue();
	System.out.println("State : " +State);
	obj.findElement(By.name("state")).sendKeys(State);

}

public static void Zip() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	String cell = row.getCell(10).toString();
	//String Zip=cell.getStringCellValue();
	System.out.println("Zipcode is :" +cell);
	obj.findElement(By.name("zipcode")).sendKeys(cell);

}
public static void Pin() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	String cell = row.getCell(11).toString();
	//String Pin=cell.getStringCellValue();
	System.out.println("Pin : " +cell);
	obj.findElement(By.name("pin")).sendKeys(cell);

}

public static void Cnfrm_Pin() throws Exception
{
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("TestData");
	Row row = sheet.getRow(0);
	String cell = row.getCell(12).toString();
	System.out.println("Conform Pin : " +cell);
	//String Cnfrm_Pin=cell.getStringCellValue();
	//System.out.println(Cnfrm_Pin);
	obj.findElement(By.name("cpin")).sendKeys(cell);

}

public static void Submit() throws Exception
{
	
	obj.findElement(By.id("submitButton")).click();
	obj.close();


}



}
