package testNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 5, threadPoolSize = 2)
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("launched", true);
		driver.manage().window().maximize();
		Reporter.log("maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Reporter.log("implicit wait", true);
		driver.quit();
		Reporter.log("quitted", true);
	}	
}
