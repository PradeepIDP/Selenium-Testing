package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MyContentPage extends ProjectSpecificMethods {

	
	public ChatterPage clickChatter() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Chatter']"));
        reportStep(" Chatter menu clicked successfully","pass");
        return new ChatterPage();

	}
}
