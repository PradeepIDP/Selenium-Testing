package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void preCondition(String browser, String url) {
		startApp(browser , false, url);
		setNode();

	}
	
	@AfterMethod
	public void postCondition() {
		close();

	}

	

	
	  

	
	
}
