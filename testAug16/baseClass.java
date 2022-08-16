package testAug16;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public ChromeDriver driver;
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void loginData(String url, String username, String password) {

	WebDriverManager.chromedriver().setup();
	
	WebDriverManager.chromedriver().setup();
    ChromeOptions opt2 = new ChromeOptions();
    opt2.addArguments("disable-notifications");
    driver = new ChromeDriver(opt2);
			
	
	driver.manage().window().maximize();

	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("Login")).click();

}
	
	
}
