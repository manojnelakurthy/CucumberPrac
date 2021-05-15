package common;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.ExcelData;
import constants.Webdriver;

public class Employeeelements extends Webdriver{
	ExcelData xldata=new ExcelData();
	HashMap<String, String> data;
	String value;
	private  WebElement empname,mobileno,address1,country,update,success;

	public WebElement empelement(){
		try{
			data=xldata.read();
			value = data.get("details");
		empname=driver.findElement(By.linkText(value));
		}catch(Exception e){
			
		}
		return empname;
	}
	
	public WebElement enterMobileNum(){
		try{
			data=xldata.read();
			value = data.get("mobnum");
		mobileno=driver.findElement(By.name(value));
		}catch(Exception e){
			
		}
		return mobileno;
	}
	
	public WebElement enterAddress1(){
		try{
			data=xldata.read();
			value = data.get("address");
		address1=driver.findElement(By.name(value));
		}catch(Exception e){
			
		}
		return address1;
	}
	
	public WebElement selectCountry(){
		try{
			data=xldata.read();
			value = data.get("country");
		country=driver.findElement(By.id(value));
		}catch(Exception e){
			
		}
		return country;
	}
	
	public WebElement update(){
		try{
			data=xldata.read();
			value = data.get("update");
		update=driver.findElement(By.name(value));
		}catch(Exception e){
			
		}
		return update;
	}
	public WebElement messageele(){
		try{
			data=xldata.read();
			value = data.get("message");
		success=driver.findElement(By.xpath(value));
	}catch(Exception e){
			
		}
		return success;
	}
}
