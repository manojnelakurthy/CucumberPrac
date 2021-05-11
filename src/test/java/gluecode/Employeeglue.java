package gluecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.Employeeelements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Employeeglue {
	Employeeelements emele=new Employeeelements();
	
	@Given("^User Click On Employee Name$")
	public void user_Click_On_Employee_Name() throws Throwable {
	WebElement empele=emele.empelement();
	empele.click();
	}

	@Then("^User Get The Update Form$")
	public void user_Get_The_Update_Form() throws Throwable {
	
	}

	@Then("^User Enters Mobile Number \"([^\"]*)\"$")
	public void user_Enters_Mobile_Number(String mobno) throws Throwable {
	 WebElement mno= emele.enterMobileNum();
	 mno.clear();
	 mno.sendKeys(mobno);
	}

	@Then("^User Enters Address \"([^\"]*)\"$")
	public void user_Enters_Address(String address1) throws Throwable {
		 WebElement address=emele.enterAddress1();
		 address.clear();
		 address.sendKeys(address1);
	}

	@Then("^User Selects Country \"([^\"]*)\"$")
	public void user_Selects_Country(String country) throws Throwable {
	   WebElement coun=emele.selectCountry();
	   Select counsel=new Select(coun);
	   counsel.selectByVisibleText(country);
	}

	@When("^User Click On Update Employee$")
	public void user_Click_On_Update_Employee() throws Throwable {
	  WebElement updt=emele.update();
	  updt.click();
	}

	@Then("^User Gets The Success Message$")
	public void user_Gets_The_Success_Message() throws Throwable {
	 
	}
}
