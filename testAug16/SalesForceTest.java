package testAug16;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTest extends baseClass {
	@Test(dataProvider="excelData")
	
	public void salesForce(String fName, String lName, String email ) {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		WebElement searchtxt = driver.findElement(By.xpath("//div[contains(@class,'slds-form-element__control slds-grow')]//input[1]"));
		searchtxt.click();
		searchtxt.sendKeys("contacts");
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[@title='Mr.']")).click();
		WebElement typedFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		typedFname.sendKeys(fName);
		String firstName = typedFname.getAttribute("value");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@inputmode='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).click();
		driver.findElement(By.xpath("//span[@title='New Account']")).click();
		driver.findElement(By.xpath("//input[@data-interactive-lib-uid='5']")).sendKeys("Credits");
		driver.findElement(By.xpath("//button[@title='Save']//span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String contactName = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
		
		if (firstName.equals(contactName) ) {
			System.out.println("Given Name is "+contactName);
			
		} else {
			System.out.println("Entered name is not matched with the given name. Contact name is: "+contactName);
		}
	
	}
	
@DataProvider(name="excelData")
public String[][] setData() throws IOException{
	return ReadDataExcel.readData();
}
	
	
}