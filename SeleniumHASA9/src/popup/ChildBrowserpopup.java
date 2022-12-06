package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
	String expectedTitle="Easy Recipes, Healthy Eating Ideas and Chef Recipe Videos | Food Network";
	Set<String> allId = driver.getWindowHandles();
	for(String id:allId) {
		Thread.sleep(2000);
		driver.switchTo().window(id);
		if(expectedTitle.equals(driver.getTitle())) {
			driver.manage().window().maximize();
		}
		driver.close();
	}
}
}
