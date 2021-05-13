package common;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import constants.Webdriver;

public class Reportelements extends Webdriver{

	private WebElement report,viewreport,employeebutton,projectbutton,empsel,projsel,calendar,calendar1,viewrepele;
	
	
	public void acceptAlert(){
		driver.switchTo().alert().accept();
	}
	
	public WebElement reportelement(){
		report=driver.findElement(By.linkText("Report"));
		return report;
	}
	
	public WebElement clickEmpButton(){
		employeebutton=driver.findElement(By.xpath("//input[@id='empid']//following-sibling::input[2]"));
		return employeebutton;
	}
	
	public WebElement selectEmployee(){
	    empsel=driver.findElement(By.id("selEmployeeId"));
		return empsel;
	}
	
	public WebElement clickProjButton(){
		projectbutton=driver.findElement(By.xpath("//input[@id='prjid']//following-sibling::input[2]"));
		return projectbutton;
	}
	public WebElement selectproject(){
	    projsel=driver.findElement(By.id("selProjectId"));
		return projsel;
	}
	public WebElement clickCalendar(){
		calendar=driver.findElement(By.id("anchor1"));
		return calendar;
	}
	public void selectstartdate(String mnthyr,String dt){
		Set<String> windows=driver.getWindowHandles();
		Object[] windows1=windows.toArray();
		String window1=windows1[0].toString();
		String window2=windows1[1].toString();
		driver.switchTo().window(window2);
		String monthyear=mnthyr;
		String calmonthyear=driver.findElement(By.xpath("//span[@class='cpMonthNavigation']")).getText();
		while(!calmonthyear.equalsIgnoreCase(monthyear)){
			driver.findElement(By.xpath("//table[@width='100%']//tbody//child::tr//child::td[3]//child::a")).click();
			calmonthyear=driver.findElement(By.xpath("//span[@class='cpMonthNavigation']")).getText();
		}
		driver.findElement(By.linkText(dt)).click();
		driver.switchTo().window(window1);
	}
	
	
		public WebElement clickCalendar1(){
			calendar1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/a"));
			return calendar1;
		}
		
	public void selectenddate(String mnthyr,String dt){
		Set<String> windows=driver.getWindowHandles();
		Object[] windows1=windows.toArray();
		String window1=windows1[0].toString();
		String window2=windows1[1].toString();
		driver.switchTo().window(window2);
		String monthyear=mnthyr;
		String calmonthyear=driver.findElement(By.xpath("//span[@class='cpMonthNavigation']")).getText();
		while(!calmonthyear.equalsIgnoreCase(monthyear)){
			driver.findElement(By.xpath("//table[@width='100%']//tbody//child::tr//child::td[3]//child::a")).click();
			calmonthyear=driver.findElement(By.xpath("//span[@class='cpMonthNavigation']")).getText();
		}
		driver.findElement(By.linkText(dt)).click();
		driver.switchTo().window(window1);
}
	public WebElement viewReport(){
		viewreport=driver.findElement(By.xpath("//input[@value='View Report']"));
		return viewreport;
	}
	public WebElement viewreportsele(){
		viewrepele=driver.findElement(By.linkText("cullen"));
		return viewrepele;
	}
}