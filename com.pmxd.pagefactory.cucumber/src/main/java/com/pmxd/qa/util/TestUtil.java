package com.pmxd.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {

	public static long Page_Load_Timeout = 30;
	public static long Implicitly_Wait =20;
	
	
	public static void ddSelect(WebElement DropdownLocator, String SelectValue) {
		Select dropdown = new Select(DropdownLocator);  
		dropdown.selectByVisibleText("SelectValue"); 
	}
	
}
