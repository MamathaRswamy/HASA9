package classpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterdatausingjs {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SeleniumHASA9\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 WebElement element = driver.findElement(By.id("email"));
	 js.executeScript("arguments[0].value='1231'", element);
}
}
