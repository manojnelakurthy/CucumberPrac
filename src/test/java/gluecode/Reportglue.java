package gluecode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.Loginelements;
import common.Reportelements;
import constants.Report;
import constants.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reportglue extends Report{

	Loginelements ele=new Loginelements();
	  Reportelements r_ele=new Reportelements();
	  Screenshot ss=new Screenshot();
	  
	@Given("^User Is On Report Page$")
	public void user_Is_On_Report_Page() throws Throwable {
		 test=startReport("View Report  Test");
	}

	@Given("^User Select Employee \"([^\"]*)\"$")
	public void user_Select_Employee(String employeename) throws Throwable {
	WebElement employee=  r_ele.clickEmpButton();
	employee.click();
	WebElement empsel=r_ele.selectEmployee();
	Select empdd=new Select(empsel);
	empdd.selectByVisibleText(employeename);
	}

	@Given("^User Select Project \"([^\"]*)\"$")
	public void user_Select_Project(String projectname) throws Throwable {
		WebElement project=  r_ele.clickProjButton();
		project.click();
		WebElement projsel=r_ele.selectproject();
		Select projdd=new Select(projsel);
		projdd.selectByVisibleText(projectname);
	}

	@Given("^User Select Start Date \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Select_Start_Date(String monthyear,String date) throws Throwable {
	  WebElement calendar=r_ele.clickCalendar();
	  calendar.click();
	  r_ele.selectstartdate(monthyear, date);
	}

	@Given("^User Select End Date \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Select_End_Date(String monthyear,String date) throws Throwable {
		 WebElement calendar1=r_ele.clickCalendar1();
		  calendar1.click();
		r_ele.selectenddate(monthyear, date);
	}

	@When("^User Click On View Report$")
	public void user_Click_On_View_Report() throws Throwable {
	  WebElement viewreports=r_ele.viewReport();
	  viewreports.click();
	}

	@Then("^Site Shows The Details Of Report$")
	public void site_Shows_The_Details_Of_Report() throws Throwable {
	   WebElement view=r_ele.viewreportsele();
	   if(view.isDisplayed()){
		   test.log(LogStatus.PASS, "Pass");
		   ss.screenShot(test);
		  
	   }else{
		   test.log(LogStatus.FAIL, "Fail");
		   ss.screenShot(test);
		  
	   }
	   endReport(test);
	}

	
}
