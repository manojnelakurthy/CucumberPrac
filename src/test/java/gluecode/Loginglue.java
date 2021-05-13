package gluecode;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import common.Loginelements;
import common.Reportelements;
import constants.Report;
import constants.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginglue extends Report{
	 
	  Loginelements ele=new Loginelements();
	  Reportelements r_ele=new Reportelements();
	 Screenshot ss=new Screenshot();
	
	  @Given("^User Is On Login Page \"([^\"]*)\",\"([^\"]*)\"$")
	  public void user_Is_On_Login_Page(String browser,String url)  {
	  ele.start(browser, url);
	 test=startReport("Login Test");
	  }
	
	@Given("^User Enters Username \"([^\"]*)\"$")
	public void user_Enters_Username(String username) {
	 WebElement username_ele=ele.enterUsername();
	 username_ele.sendKeys(username);
	}

	@Given("^User Enters Password \"([^\"]*)\"$")
	public void user_Enters_Password(String password) {
		WebElement password_ele=ele.enterPassword();
		password_ele.sendKeys(password);
	}

	@When("^User Click On Login$")
	public void user_Click_On_Login()  {
	  WebElement login_ele=ele.clicklogin();
	  login_ele.click();
	}
	
	@Then("^User Gets Error Message \"([^\"]*)\"$")
	public void user_Gets_Error_Message(String error) throws Exception {
		test1=startReport1("Invalid Login");
	   String errmessage=ele.error();
	   if(errmessage.equalsIgnoreCase(error)){
		   test1.log(LogStatus.PASS, "Login Invalid test Pass");
			 ss.screenShot(test1);
			 endReport1(test1);
	   }else{
			  test1.log(LogStatus.FAIL, "Login Invalid test Fail");
			  ss.screenShot(test1);
			  endReport1(test1);
	   }
	}

	@Then("^An Alert Is Present and Accept That$")
	public void an_Alert_Is_Present_and_Accept_That() {
	  r_ele.acceptAlert();
	}

	@Then("^User Should Get Report Page$")
	public void user_Should_Get_Report_Page() throws Exception  {
	  WebElement reportele=r_ele.reportelement();
	  if(reportele.isDisplayed()){
		 test.log(LogStatus.PASS, "Pass");
		 ss.screenShot(test);
		 
	  }else{
		  test.log(LogStatus.FAIL, "Fail");
		  ss.screenShot(test);
		
	  }
	  endReport(test);
	}
	
}
