package pom;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SeleniumHASA9\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	LoginPage login=new LoginPage(driver);
	driver.navigate().refresh();
	login.getLoginLink().click();
	login.getEmailTF().sendKeys("sdsdfsdfsfdsdfsdfsdf");
	login.getPasswordTF().sendKeys("56562326562");
	login.getLoginButton().click();
}
}
