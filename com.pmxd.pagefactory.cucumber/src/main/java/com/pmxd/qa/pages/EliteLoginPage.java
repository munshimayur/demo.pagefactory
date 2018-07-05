package com.pmxd.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pmxd.qa.base.TestBase;

public class EliteLoginPage extends TestBase{

	//Page Factory / OR
	
	String uname_xpath = prop.getProperty("elite_uname_xpath");
	String pwd_xpath= prop.getProperty("elite_pwd_xpath");
	String elite_loginButton_xpath=prop.getProperty("elite_loginButton_xpath");
	String elite_logo_xpath=prop.getProperty("elite_logo_xpath");
	
	@FindBy(xpath = "//input [@id=\"login\"]")
	WebElement elite_username;
	
	@FindBy(xpath = "//input [@id=\"password\"]")
	WebElement elite_password;
	
	@FindBy(xpath = "//input [@id=\"loginSubmit\"]")
	WebElement elite_login;
	
	@FindBy(xpath = "//img [contains (@src, 'elite_logo.png')]")
	WebElement elite_logo;
	
	public EliteLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateEliteLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean validateEliteLogo() {
		
		return elite_logo.isDisplayed();
		
	}
	
	public EliteMyWebcastPage eliteLogin() {
		elite_username.sendKeys(prop.getProperty("elite_username"));
		elite_password.sendKeys(prop.getProperty("elite_password"));
		elite_login.click();
		return new EliteMyWebcastPage();
		
	}
	

	
	
	
	


}
