package gluecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import common.Employeeelements;
import constants.Report;
import constants.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Employeeglue extends Report{
	Employeeelements emele=new Employeeelements();
	 Screenshot ss=new Screenshot();
	
	@Given("^User Click On Employee Name$")
	public void user_Click_On_Employee_Name(){
		 test=startReport("Update Employee Test");
	emele.js_clickempelement();
	}


	@Then("^User Enters Mobile Number \"([^\"]*)\"$")
	public void user_Enters_Mobile_Number(String mobno)  {
	 WebElement mno= emele.enterMobileNum();
	 mno.clear();
	emele.js_entermobnumber(mobno);
	}

	@Then("^User Enters Address \"([^\"]*)\"$")
	public void user_Enters_Address(String address1) {
		 WebElement address=emele.enterAddress1();
		 address.clear();
		emele.js_enteraddress(address1);
	}

	@Then("^User Selects Country \"([^\"]*)\"$")
	public void user_Selects_Country(String country)  {
	   WebElement coun=emele.selectCountry();
	   Select counsel=new Select(coun);
	   counsel.selectByVisibleText(country);
	}

	@When("^User Click On Update Employee$")
	public void user_Click_On_Update_Employee()  {
	 emele.js_clickupdate();
	}

	@Then("^User Gets The Success Message$")
	public void user_Gets_The_Success_Message() {
		try{
	 WebElement success1=emele.messageele();
	 if(success1.isDisplayed()){
		 test.log(LogStatus.PASS, "Pass");
		 ss.screenShot(test);
		 
	 }else{
		 test.log(LogStatus.FAIL, "Fail");
		 ss.screenShot(test);
		
	 }
	 endReport(test);
		}catch(Exception e){
			
		}
	}
}
