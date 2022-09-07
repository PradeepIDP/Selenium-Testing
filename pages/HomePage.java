package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage clickMenu1() {
		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
        reportStep(" Menu button clicked successfully","pass");
        return this;
    }
	public HomePage clickViewAll1() {
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
        reportStep(" View all button clicked successfully","pass");
        return this;

	}
	public HomePage searchText1() {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Search apps or items...']/following::input"), "Content");
        reportStep(" Search text entered successfully","pass");
        return this;

	}
	
	public MyContentPage clickContacts() {
		click(locateElement(Locators.XPATH, "//mark[text()='Content']"));
        reportStep(" Content link clicked successfully","pass");
        return new MyContentPage();

	}

}
