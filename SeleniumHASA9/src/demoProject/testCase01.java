package demoProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import testScript.LoginPage;

public class testCase01 extends BaseClass {
	@Test
public void demo() {
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

}
}
