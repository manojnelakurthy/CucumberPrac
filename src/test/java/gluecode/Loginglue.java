package gluecode;

import org.openqa.selenium.WebElement;
import common.Loginelements;
import common.Reportelements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginglue{
	 
	  Loginelements ele=new Loginelements();
	  Reportelements r_ele=new Reportelements();
	  
	  @Given("^User Is On Login Page \"([^\"]*)\",\"([^\"]*)\"$")
	  public void user_Is_On_Login_Page(String browser,String url) throws Throwable {
	  ele.start(browser, url);
	  }

	@Given("^User Enters Username \"([^\"]*)\"$")
	public void user_Enters_Username(String username) throws Throwable {
	 WebElement username_ele=ele.enterUsername();
	 username_ele.sendKeys(username);
	}

	@Given("^User Enters Password \"([^\"]*)\"$")
	public void user_Enters_Password(String password) throws Throwable {
		WebElement password_ele=ele.enterPassword();
		password_ele.sendKeys(password);
	}

	@When("^User Click On Login$")
	public void user_Click_On_Login() throws Throwable {
	  WebElement login_ele=ele.clicklogin();
	  login_ele.click();
	}
	
	@Then("^An Alert Is Present and Accept That$")
	public void an_Alert_Is_Present_and_Accept_That() throws Throwable {
	  r_ele.acceptAlert();
	}

	@Then("^User Should Get Report Page$")
	public void user_Should_Get_Report_Page() throws Throwable {
	  WebElement report=r_ele.reportelement();
	  if(report.isDisplayed()){
		  
	  }
	}
	
}
