package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/User/Desktop/dd.html");
		WebElement dd = driver.findElement(By.id("single"));
		Select select=new Select(dd);
		List<WebElement> options = select.getOptions();
		for(int i=options.size()-1;i>=0;i--) {
			select.selectByIndex(i);
			Thread.sleep(2000);
		}
		driver.quit();
	}
}
