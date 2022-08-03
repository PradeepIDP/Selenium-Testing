package seleniumweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssesmentTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions opt2 = new ChromeOptions();
        opt2.addArguments("disable-notifications");
        ChromeDriver driver = new ChromeDriver(opt2);
				
		
		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password$123");
		driver.findElement(By.id("Login")).click();
	
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@title='Setup']"))
		 */
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		
		
		driver.findElement(By.xpath("//a[@title='Opportunities']//parent::one-app-nav-bar-item-root")).click();
		driver.findElement(By.xpath("//a[@title='New']")).click();
		WebElement givenName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		givenName.sendKeys("Salesforce Automation by Pradeep");
		String printName = givenName.getAttribute("value");
		System.out.println(printName);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']/following-sibling::button[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'slds-combobox__form-element slds-input-has-icon')]//button")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement OppName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String printName1 = OppName.getAttribute("value");
		System.out.println(printName1);
		
		if (printName1.equals(printName)) {
			System.out.println("Oppertunity name is Matched");
		}
			else{
				System.out.println("Oppertunity name is Not Matched");
			}
		}

}
