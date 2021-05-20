package common;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import constants.ExcelData;
import constants.driverfactory;

public class AllElements extends driverfactory{
	ExcelData xldata=new ExcelData();
	HashMap<String, List<String>> data=null;
	String locatorname=null;
	String locatorvalue=null;
	
	public void start(String browser,String url){
		launch(browser);
		driver.get(url);
	}
	
	public WebElement enterUsername(){
		WebElement uname = null;
		try{
			data=xldata.read();
		
		locatorname=data.get("username").get(0);
		locatorvalue=data.get("username").get(1);
	
		switch(locatorname){
		case "id":
			uname=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			uname=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			uname=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			uname=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return uname;
}
	public WebElement enterpassword(){
		WebElement pword = null;
		try{
		locatorname=data.get("password").get(0);
		locatorvalue=data.get("password").get(1);
	
		switch(locatorname){
		case "id":
			pword=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			pword=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			pword=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			pword=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return pword;
}
	public WebElement clickLogin() {
		WebElement login = null;
		try{
		locatorname=data.get("login").get(0);
		locatorvalue=data.get("login").get(1);
	
		switch(locatorname){
		case "id":
			login=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			login=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			login=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			login=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return login;
}
	public void alertaccept(){
		driver.switchTo().alert().accept();
	}
	
	public WebElement error(){
		WebElement error = null;
		try{
		locatorname=data.get("error").get(0);
		locatorvalue=data.get("error").get(1);
	
		switch(locatorname){
		case "id":
			error=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			error=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			error=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			error=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
	}catch(Exception e){
		
	}
		return error;
}
	public WebElement reportelement() {
		WebElement report= null;
		try{
		locatorname=data.get("report").get(0);
		locatorvalue=data.get("report").get(1);
	
		switch(locatorname){
		case "id":
			report=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			report=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			report=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			report=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return report;
}
	public WebElement clickEmployee(){
		WebElement empbutton= null;
		try{
			data=xldata.read();
		locatorname=data.get("empbut").get(0);
		locatorvalue=data.get("empbut").get(1);
	
		switch(locatorname){
		case "id":
			empbutton=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			empbutton=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
		  empbutton=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			empbutton=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return empbutton;
}
	public WebElement selectEmployee(){
		WebElement empsel= null;
		try{
			data=xldata.read();
		
		locatorname=data.get("empsel").get(0);
		locatorvalue=data.get("empsel").get(1);
	
		switch(locatorname){
		case "id":
			empsel=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			empsel=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			empsel=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			empsel=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return empsel;
}
	public WebElement clickProj() {
		WebElement projbut= null;
		try{
			data=xldata.read();
		locatorname=data.get("projbutton").get(0);
		locatorvalue=data.get("projbutton").get(1);
	
		switch(locatorname){
		case "id":
			projbut=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			projbut=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			projbut=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			projbut=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		}catch(Exception e){
			
		}
		return projbut;
}
	public WebElement selectProj() {
		WebElement projsel= null;
		try{
			data=xldata.read();
		locatorname=data.get("projsel").get(0);
		locatorvalue=data.get("projsel").get(1);
		switch(locatorname){
		case "id":
			projsel=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			projsel=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			projsel=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			projsel=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return projsel;
}
	public WebElement clickCalendar() {
		WebElement calendar= null;
		try{
			data=xldata.read();
		locatorname=data.get("calendar").get(0);
		locatorvalue=data.get("calendar").get(1);
		switch(locatorname){
		case "id":
			calendar=driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			calendar=driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			calendar=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			calendar=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return calendar;
}
	public WebElement calmonthyear() {
		WebElement calmonthyear= null;
		try{
			data=xldata.read();
		locatorname=data.get("calmonthyear").get(0);
		locatorvalue=data.get("calmonthyear").get(1);
		switch(locatorname){
		case "id":
			calmonthyear =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			calmonthyear =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			calmonthyear=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			calmonthyear=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return calmonthyear;
}
	public WebElement clickNext() {
		WebElement next= null;
		try{
			data=xldata.read();
		locatorname=data.get("next").get(0);
		locatorvalue=data.get("next").get(1);
		switch(locatorname){
		case "id":
			next =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			next =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			next=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			next=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return next;
}
	public WebElement clickCalendar1() {
		WebElement calendar1= null;
		try{
			data=xldata.read();
		locatorname=data.get("calendar1").get(0);
		locatorvalue=data.get("calendar1").get(1);
		switch(locatorname){
		case "id":
			calendar1 =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			calendar1 =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			calendar1=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			calendar1=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return calendar1;
}
	public WebElement viewReport() {
		WebElement viewreport= null;
		try{
			data=xldata.read();
		locatorname=data.get("viewreport").get(0);
		locatorvalue=data.get("viewreport").get(1);
		switch(locatorname){
		case "id":
			viewreport =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			viewreport =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			viewreport=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			viewreport=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return viewreport;
}
	public WebElement detailsElement() {
		WebElement details= null;
		try{
			data=xldata.read();
		locatorname=data.get("details").get(0);
		locatorvalue=data.get("details").get(1);
		switch(locatorname){
		case "id":
			details =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			details =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			details=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			details=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return details;
}
	public WebElement enterMobNum() {
		WebElement mobnum= null;
		try{
			data=xldata.read();
		locatorname=data.get("mobnum").get(0);
		locatorvalue=data.get("mobnum").get(1);
		switch(locatorname){
		case "id":
			mobnum =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			mobnum =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			mobnum=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			mobnum=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return mobnum;
}
	public WebElement enterAddress() {
		WebElement address= null;
		try{
			data=xldata.read();
		locatorname=data.get("address").get(0);
		locatorvalue=data.get("address").get(1);
		switch(locatorname){
		case "id":
			address =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			address =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			address=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			address=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return address;
}
	public WebElement enterCountry() {
		WebElement country= null;
		try{
			data=xldata.read();
		locatorname=data.get("country").get(0);
		locatorvalue=data.get("country").get(1);
		switch(locatorname){
		case "id":
			country =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			country =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			country=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			country=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return country;
}
	public WebElement clickUpdate() {
		WebElement update= null;
		try{
			data=xldata.read();
		locatorname=data.get("update").get(0);
		locatorvalue=data.get("update").get(1);
		switch(locatorname){
		case "id":
			update =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			update =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			update=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			update=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return update;
}
	public WebElement messageElement() {
		WebElement message= null;
		try{
			data=xldata.read();
		locatorname=data.get("message").get(0);
		locatorvalue=data.get("message").get(1);
		switch(locatorname){
		case "id":
			message =driver.findElement(By.id(locatorvalue));
			break;
		case "name":
			message =driver.findElement(By.name(locatorvalue));
			break;
		case "xpath":
			message=driver.findElement(By.xpath(locatorvalue));
			break;
		case "linktext":
			message=driver.findElement(By.linkText(locatorvalue));
			break;
			default:
				break;
		}
		
		}catch(Exception e){
			
		}
		return message;
}
	public void selecAdate(String mnthyr,String dt){
		try {
			data=xldata.read();
			String value = data.get("calmonthyear").get(1);
			String value1 = data.get("next").get(1);
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
}