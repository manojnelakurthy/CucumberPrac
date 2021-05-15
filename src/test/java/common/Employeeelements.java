package common;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.ExcelData;
import constants.Webdriver;

public class Employeeelements extends Webdriver{
	ExcelData xldata=new ExcelData();
	HashMap<String, String> data =null;
	private  WebElement empname,mobileno,address1,country,update,success;

	public WebElement empelement(){
		empname=driver.findElement(By.linkText("cullen"));
		return empname;
	}
	
	public WebElement enterMobileNum(){
		mobileno=driver.findElement(By.name("mob_number"));
		return mobileno;
	}
	
	public WebElement enterAddress1(){
		address1=driver.findElement(By.name("address1"));
		return address1;
	}
	
	public WebElement selectCountry(){
		country=driver.findElement(By.id("country"));
		return country;
	}
	
	public WebElement update(){
		update=driver.findElement(By.name("submit"));
		return update;
	}
	public WebElement messageele(){
		success=driver.findElement(By.xpath("//font[@color='#008000']"));
		return success;
	}
}
