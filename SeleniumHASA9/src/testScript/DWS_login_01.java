package testScript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_login_01 {
	@Test
	public void loginThough_Valid_credentials() {
		//precondition
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browser is launched and window is maximized", true);

		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("succesfully navigated to application", true);
		//Test data
		String ExpectedTitle="Demo Web Shop";
		String Username="mamatharangaswamaiah@gmail.com";
		String password="Mamatha@143";

		//test steps
		LoginPage login=new LoginPage(driver);
		login.getLoginLink().click();
		Reporter.log("Succesfully entered login page",true);
		assertTrue(login.getEmailTF().isDisplayed());
		login.getEmailTF().sendKeys(Username);
		Reporter.log("entered username", true);
		login.getPasswordTF().sendKeys(password);
		Reporter.log("entered password", true);
		login.getLoginButton().click();
		assertEquals(driver.getTitle(), ExpectedTitle);
		Reporter.log("succesfully logged in", true);

		//Post conditions
		driver.quit();	
	}
}
