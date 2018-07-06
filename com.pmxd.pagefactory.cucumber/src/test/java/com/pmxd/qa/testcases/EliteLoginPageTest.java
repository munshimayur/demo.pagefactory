package com.pmxd.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pmxd.qa.base.TestBase;
import com.pmxd.qa.pages.EliteLoginPage;

import junit.framework.Assert;

public class EliteLoginPageTest extends TestBase {
	
	EliteLoginPage eliteLoginPage;
	
	public EliteLoginPageTest() {
		super();
	}
	
	@BeforeMethod 
	public void setup(){
		initialization();
		eliteLoginPage = new EliteLoginPage();
		
	}
	
  @Test (priority = 1)
  public void titleTest() {
	 String val= eliteLoginPage.validateEliteLoginPageTitle();
	 Assert.assertEquals("Login | Webcast Elite", val);	  
  }
  
  @Test (priority = 2)
  public void logoTest() {
	  boolean val=eliteLoginPage.validateEliteLogo();
	  Assert.assertTrue(val);
			  
  }
  
  @Test (priority = 3)
  public void loginTest() {
	  eliteLoginPage.eliteLogin();
	  
  }
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
