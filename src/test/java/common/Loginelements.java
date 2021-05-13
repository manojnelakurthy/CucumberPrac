package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.Webdriver;

public class Loginelements extends Webdriver{
 
	private WebElement username_ele,password_ele,login_ele;

	
	public void start(String browser,String url){
		launch(browser);
		driver.get(url);
	}
	public WebElement enterUsername(){
		username_ele=driver.findElement(By.id("username"));
		return username_ele;
	}
	
	public WebElement enterPassword(){
		password_ele=driver.findElement(By.name("password"));
		return password_ele;
	}
	public WebElement clicklogin(){
		login_ele=driver.findElement(By.name("login"));
		return login_ele;
	}
	public String error(){
		return driver.findElement(By.xpath("//font[@color='#FF0000']")).getText();
	}
}
