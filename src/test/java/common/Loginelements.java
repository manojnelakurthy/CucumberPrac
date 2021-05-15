package common;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.ExcelData;
import constants.Webdriver;

public class Loginelements extends Webdriver{
 ExcelData xldata=new ExcelData();
	HashMap<String, String> data;
	private WebElement username_ele,password_ele,login_ele;
   String value;
	
	public void start(String browser,String url){
		launch(browser);
		driver.get(url);
	}
	public WebElement enterUsername(){
		try{
		data=xldata.read();
		value = data.get("username");
		username_ele=driver.findElement(By.id(value));
		}catch(Exception e){
			
		}
		return username_ele;
	}
	
	public WebElement enterPassword() {
		try{
		data=xldata.read();
		value = data.get("password");
		password_ele=driver.findElement(By.name(value));
		}catch(Exception e){
			
		}
		return password_ele;
	}
	public WebElement clicklogin(){
		try{
		data=xldata.read();
		value = data.get("login");
		login_ele=driver.findElement(By.name(value));
		}catch(Exception e){
			
		}
		return login_ele;
	}
	public String error(){
		try{
		data=xldata.read();
		value = data.get("error");
		}catch(Exception e){
			
		}
		return driver.findElement(By.xpath(value)).getText();
	}
}
