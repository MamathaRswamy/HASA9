package testScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CoutingAllLink {
	@Test
public void demo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Reporter.log("Browser is launched and window is maximized", true);

	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	System.out.println("**************************************");
	for(WebElement link:allLinks) {
		System.out.println(link.getText());
	}
	driver.quit();
}
}
