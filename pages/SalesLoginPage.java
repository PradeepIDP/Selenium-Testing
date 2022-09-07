package com.salesforce.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class SalesLoginPage extends ProjectSpecificMethods{
    
    public SalesLoginPage enterUsername1(String data) {
        clearAndType(locateElement(Locators.ID, "username"), data);
        reportStep(data+" entered successfully","pass");
        return this;
    }
    
    public SalesLoginPage enterPassword1(String data) {
        clearAndType(locateElement(Locators.ID, "password"), data);
        reportStep(data+" entered successfully","pass");
        return this;
    }
    
    public HomePage clickLogin1() {
        click(locateElement(Locators.ID, "Login"));
        reportStep("Login button clicked successfully", "pass");
        return new HomePage();
    }



}