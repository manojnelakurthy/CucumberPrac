package common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.ExcelData;
import constants.Webdriver;

public class Reportelements extends Webdriver{
	ExcelData xldata=new ExcelData();
	HashMap<String, String> data =null;
	private WebElement report,viewreport,employeebutton,projectbutton,empsel,projsel,calendar,calendar1,viewrepele;
	String value,value1;
	
	public void acceptAlert(){
		driver.switchTo().alert().accept();
	}
	
	public WebElement reportelement(){
		try{
		data=xldata.read();
		value=data.get("report");
		report=driver.findElement(By.linkText(value));
		}catch(Exception e){
			
		}
		return report;
	}
	
	public WebElement clickEmpButton(){
		try {
			data=xldata.read();
			value=data.get("empbutton");
			employeebutton=driver.findElement(By.xpath(value));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employeebutton;
	}
	
	public WebElement selectEmployee(){
		try {
			data=xldata.read();
			value=data.get("empsel");
			  empsel=driver.findElement(By.id(value));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empsel;
	}
	
	public WebElement clickProjButton(){
		try {
			data=xldata.read();
			value=data.get("projbutton");
		projectbutton=driver.findElement(By.xpath(value));
		}catch(Exception e){
			
		}
		return projectbutton;
	}
	public WebElement selectproject(){
		try {
			data=xldata.read();
			value=data.get("projsel");
	    projsel=driver.findElement(By.id(value));
		}catch(Exception e){
			
		}
		return projsel;
	}
	public WebElement clickCalendar(){
		try {
			data=xldata.read();
			value=data.get("calendar");
		calendar=driver.findElement(By.id(value));
		}catch(Exception e){
			
		}
		return calendar;
	}
	
	public void selectstartdate(String mnthyr,String dt){
		try {
			data=xldata.read();
			value=data.get("calmonthyear");
			value1=data.get("next");
		Set<String> windows=driver.getWindowHandles();
		Object[] windows1=windows.toArray();
		String window1=windows1[0].toString();
		String window2=windows1[1].toString();
		driver.switchTo().window(window2);
		String monthyear=mnthyr;
		String calmonthyear=driver.findElement(By.xpath(value)).getText();
		while(!calmonthyear.equalsIgnoreCase(monthyear)){
			driver.findElement(By.xpath(value1)).click();
			calmonthyear=driver.findElement(By.xpath(value)).getText();
		}
		driver.findElement(By.linkText(dt)).click();
		driver.switchTo().window(window1);
		}catch(Exception e){
			
		}
	}
	
	
		public WebElement clickCalendar1(){
			try {
				data=xldata.read();
				value=data.get("calendar1");
			calendar1=driver.findElement(By.xpath(value));
			}catch(Exception e){
				
			}
			return calendar1;
		}
		
	public void selectenddate(String mnthyr,String dt){
		try {
			data=xldata.read();
			value=data.get("calmonthyear");
			value1=data.get("next");
		Set<String> windows=driver.getWindowHandles();
		Object[] windows1=windows.toArray();
		String window1=windows1[0].toString();
		String window2=windows1[1].toString();
		driver.switchTo().window(window2);
		String monthyear=mnthyr;
		String calmonthyear=driver.findElement(By.xpath(value)).getText();
		while(!calmonthyear.equalsIgnoreCase(monthyear)){
			driver.findElement(By.xpath(value1)).click();
			calmonthyear=driver.findElement(By.xpath(value)).getText();
		}
		driver.findElement(By.linkText(dt)).click();
		driver.switchTo().window(window1);
		}catch(Exception e){
			
		}
}
	public WebElement viewReport(){
		try {
			data=xldata.read();
			value=data.get("viewreport");
		viewreport=driver.findElement(By.xpath(value));
		}catch(Exception e){
			
		}
		return viewreport;
	}
	public WebElement viewreportsele(){
		try {
			data=xldata.read();
			value=data.get("details");
		viewrepele=driver.findElement(By.linkText(value));
		}catch(Exception e){
			
		}
		return viewrepele;
	}
}