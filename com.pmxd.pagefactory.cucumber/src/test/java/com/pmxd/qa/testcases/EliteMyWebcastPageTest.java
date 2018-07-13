package com.pmxd.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pmxd.qa.base.TestBase;
import com.pmxd.qa.pages.EliteLoginPage;
import com.pmxd.qa.pages.EliteMyWebcastPage;

import junit.framework.Assert;

public class EliteMyWebcastPageTest extends TestBase{
	
	EliteLoginPage eliteLoginPage;
	EliteMyWebcastPage eliteMyWebcastPage;
	
	public EliteMyWebcastPageTest() {
		super();
		
	}
	
	@BeforeMethod 
	public void setup(){
		initialization();
		eliteLoginPage = new EliteLoginPage();
		eliteMyWebcastPage = eliteLoginPage.eliteLogin();
		
	}
	
	
	
	
  @Test (priority=1)
    public void titleTest() {
	  
	  String val = eliteMyWebcastPage.validateEliteMyWebcastTitle();
	  
	  Assert.assertEquals("My Webcasts | Webcast Elite", val);	  
	  
  }
 
  @Test (priority=2)
  	public void validateClientSelectionTest() {
	  eliteMyWebcastPage.selectClient("PMXDMPD");
	
  }
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
}

