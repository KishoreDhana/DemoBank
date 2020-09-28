package StepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_MainClass  {		
	//static WebDriver obj;

		
		@Given("user is on rapid test page")
		public static void url() throws Exception
		{
			Register_BaseClass.Browser();
		}
		
		@When("user enter details")
		public static void product() throws Exception	
		{
		 System.out.println("You are in product method");
		 Register_BaseClass.Fname();
		 Register_BaseClass.Lname();
		 Register_BaseClass.Password();
		 Register_BaseClass.Cn_Password();
		 Register_BaseClass.Email_ID();
		 Register_BaseClass.Phone_Number();
		 Register_BaseClass.DOB();
		 Register_BaseClass.gender();
		 Register_BaseClass.Address();
		 Register_BaseClass.City_name();
		Register_BaseClass.State();
		 Register_BaseClass.Zip();
		Register_BaseClass.AccTyp();
		 Register_BaseClass.Pin();
		 Register_BaseClass.Cnfrm_Pin();
			
		}
		
		@Then("user clicks submit and logout$") 
		public void select() throws Exception 
		{
			Register_BaseClass.Submit();
		}
		
		
		
	
	}







