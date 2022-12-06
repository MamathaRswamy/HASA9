package demoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuiteAn() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browser is launched and window is maximized", true);
	}
	@BeforeTest
	public void beforeTestAn() {
		System.out.println("connected to DB");
	}
	@BeforeClass
	public void beforeClass() {	
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("succesfully navigated to application", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void AfterMetod() {
		System.out.println("AfterMetod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void afterSuite() {
		driver.quit();	
	}
}
