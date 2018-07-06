package com.pmxd.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pmxd.qa.base.TestBase;

public class EliteMyWebcastPage extends TestBase {
	
	@FindBy(xpath="//img [contains(@src, \"wce-logo.png\")]")
	WebElement MyWebcast_Logo;
	
	@FindBy(xpath="//select [contains (@ng-options, \"subClient\")]")
	WebElement ClientDropdown;
	
	
	

	public EliteMyWebcastPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectClient() {
		com.pmxd.qa.util.TestUtil.ddSelect(ClientDropdown, "PMXDMPD");
	}
	

}