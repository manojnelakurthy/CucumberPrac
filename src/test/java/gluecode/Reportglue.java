package gluecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.LogStatus;

import common.AllElements;
import constants.Report;
import constants.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reportglue extends Report{
	  Screenshot ss=new Screenshot();
	  AllElements ele=new AllElements();
	  WebElement ele1;
	@Given("^User Is On Report Page$")
	public void user_Is_On_Report_Page()  {
		 test=startReport("View Report  Test");
	}

	@Given("^User Select Employee \"([^\"]*)\"$")
	public void user_Select_Employee(String employeename)  {
		WebElement employee=ele.clickempButton();
         employee.click();
	WebElement emp=ele.selectEmployee();
	Select empsel=new Select(emp);
    empsel.selectByVisibleText(employeename);

	}

	@Given("^User Select Project \"([^\"]*)\"$")
	public void user_Select_Project(String projectname)  {
		ele.clickProj().click();
		WebElement project=  ele.clickProj();
		project.click();
		WebElement projsel=ele.selectProj();
		Select projdd=new Select(projsel);
		projdd.selectByVisibleText(projectname);
	
	}

	@Given("^User Select Start Date \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Select_Start_Date(String monthyear,String date)  {
    ele.clickCalendar().click();
	ele.selecAdate(monthyear, date);
	}

	@Given("^User Select End Date \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Select_End_Date(String monthyear,String date) {
		ele.clickCalendar1().click();
		ele.selecAdate(monthyear, date);
	}

	@When("^User Click On View Report$")
	public void user_Click_On_View_Report()  {
	ele.viewReport().click();
	}

	@Then("^Site Shows The Details Of Report$")
	public void site_Shows_The_Details_Of_Report() {
		ele1=ele.detailsElement();
		try{
	  
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
