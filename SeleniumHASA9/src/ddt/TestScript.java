package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SeleniumHASA9\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("./TestData/data.properties");
	Properties property=new Properties();
	property.load(fis);
	String url = property.getProperty("url");
	String username = property.getProperty("un");
	String password = property.getProperty("pwd");
	driver.get(url);
	driver.findElement(By.id("Email")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);
}
}
