package com.pmxd.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pmxd.qa.base.TestBase;
import com.pmxd.qa.pages.EliteLoginPage;
import com.pmxd.qa.pages.EliteMyWebcastPage;

public class EliteMyWebcastPageTest extends TestBase{
	
	EliteMyWebcastPage eliteMyWebcastPage;
	
	public EliteMyWebcastPageTest() {
		super();
	}
	

	@BeforeMethod 
	public void setup(){
		initialization();
		eliteMyWebcastPage = new EliteMyWebcastPage();
		
	}
	
	
  @Test
  
  public String getTitle() {
	return null;

  }
  
}

