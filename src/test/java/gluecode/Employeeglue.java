package gluecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import common.AllElements;
import common.Employeeelements;
import constants.Report;
import constants.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Employeeglue extends Report{
	Employeeelements emele=new Employeeelements();
	 Screenshot ss=new Screenshot();
	 AllElements ele=new AllElements();
	 WebElement ele1;
	
	@Given("^User Click On Employee Name$")
	public void user_Click_On_Employee_Name(){
		 test=startReport("Update Employee Test");
	   ele.detailsElement().click();
	}


	@Then("^User Enters Mobile Number \"([^\"]*)\"$")
	public void user_Enters_Mobile_Number(String mobno)  {
	ele.enterMobNum().clear();
   ele.enterMobNum().sendKeys(mobno);
	}

	@Then("^User Enters Address \"([^\"]*)\"$")
	public void user_Enters_Address(String address1) {
		ele.enterAddress().clear();
	    ele.enterAddress().sendKeys(address1);
	}

	@Then("^User Selects Country \"([^\"]*)\"$")
	public void user_Selects_Country(String country)  {
	   ele1=ele.enterCountry();
	   Select counsel=new Select(ele1);
	   counsel.selectByVisibleText(country);
	  // emele.js_selectemployee(country);
	}

	@When("^User Click On Update Employee$")
	public void user_Click_On_Update_Employee()  {
	ele.clickUpdate().click();
	}

	@Then("^User Gets The Success Message$")
	public void user_Gets_The_Success_Message() {
		try{
	ele1=ele.messageElement();
	 if(ele1.isDisplayed()){
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
