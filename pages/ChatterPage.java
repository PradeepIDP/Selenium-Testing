package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ChatterPage extends ProjectSpecificMethods{

	public ChatterPage verifyChatterPage() {
		
		verifyTitle("Chatter Home | Salesforce");
		reportStep("Chatter title verified successfully","pass");
        return this;

	}
	
	public ChatterPage clickQuestionTab() {
		click(locateElement(Locators.XPATH, "//span[text()='Question']"));
        reportStep(" Question tab clicked successfully","pass");
        return this;

	}
	 public ChatterPage enterQuestion(String data) {
		 clearAndType(locateElement(Locators.XPATH, "//textarea[@class='cuf-questionTitleField textarea']"), data);
	        reportStep(data+"entered successfully","pass");
	        return this;
	}
	 
	 public ChatterPage enterDetails(String data) {
		 clearAndType(locateElement(Locators.XPATH, "//div[contains(@class,'ql-editor ql-blank')]"), data);
	        reportStep(data+"entered successfully","pass");
	        return this;
	}
	 
	 public ChatterPage clickAsk() {
		 click(locateElement(Locators.XPATH, "//button[text()='Ask']"));
	        reportStep(" Ask button clicked successfully","pass");
	        return this;

	}
	 
	 public ChatterPage verifyQuestion(String data) {
		 verifyExactText(locateElement(Locators.XPATH,"//span[text()='"+data+"']"), data);
	        reportStep(data+" is matching with provided question name", "pass");
	        return this;

	}
}
