package StepDef;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundTransfer_MainClass 
{
	static WebDriver obj;
	

	
	@Given("user login into the Demo bank page")
	public static void chrome()
	{
		FundTransfer_BaseClass.Initiating_browser();
	}
	
	@When("user login using valid credentials")
	public static void Clicks_login() throws Exception
	{
		
		FundTransfer_BaseClass.login();
		
	}
	
	
	
	@When("user click FundTransfer")
	public static void Clicks_FT() throws Exception
	{
		FundTransfer_BaseClass.Click_FT();
	}
	
	@Then("user fills the fund transfer form")
	public static void FT_Form() throws Exception
	{
		FundTransfer_BaseClass.Fill_details();
	}
	
	@Then("user enter transcation authorisation code")
	public static void Auth_Code() throws Exception
	{
		FundTransfer_BaseClass.PIN();
		System.out.println("Transcation Successfull");
	}
	
	@Then("after successfull transcation user logouts")
	public static void Logout() throws Exception
	{
		FundTransfer_BaseClass.User_Logout();
	}
}
