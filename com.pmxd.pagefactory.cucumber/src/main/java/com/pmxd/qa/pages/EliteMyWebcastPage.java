package com.pmxd.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pmxd.qa.base.TestBase;

public class EliteMyWebcastPage extends TestBase {
	
	@FindBy(xpath="//img [contains(@src, \"wce-logo.png\")]")
	WebElement MyWebcast_Logo;
	

	
	public EliteMyWebcastPage() {
		
		PageFactory.initElements(driver, this);
	}
}
