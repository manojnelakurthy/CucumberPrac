package common;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	 public void js_clickempelement(){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 try{
				data=xldata.read();
				value = data.get("details");
				empname=driver.findElement(By.linkText(value));
		 js.executeScript("arguments[0].click();",empname);
		 }catch(Exception e){
			 
		 }
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
	
	 public void js_entermobnumber(String mobilenum){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 try{
				data=xldata.read();
				value = data.get("mobnum");
				mobileno=driver.findElement(By.name(value));
		 js.executeScript("arguments[0].value='"+mobilenum+"';",mobileno);
		 }catch(Exception e){
			 
		 }
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

	 public void js_enteraddress(String address){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 try{
				data=xldata.read();
				value = data.get("address");
				address1=driver.findElement(By.name(value));
		 js.executeScript("arguments[0].value='"+address+"';",address1);
		 }catch(Exception e){
			 
		 }
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
	 public void js_selectemployee(String option){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 try{
				data=xldata.read();
				value = data.get("empsel");
				country=driver.findElement(By.id(value));
		 js.executeScript("var country = arguments[0]; for(var i=0; i< country.options.length;i++){ if(country.options[i].text == arguments[1]){ country.options[i].selected = true; } }", country, option);
		 }catch(Exception e){
			 
		 }
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
	
	public void js_clickupdate(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 try{
				data=xldata.read();
				value = data.get("update");
				update=driver.findElement(By.name(value));
		 js.executeScript("arguments[0].click();",update);
		 }catch(Exception e){
			 
		 }
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
