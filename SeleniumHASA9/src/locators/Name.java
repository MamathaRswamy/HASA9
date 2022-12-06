package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/seleniump.html");
	driver.manage().window().maximize();
	driver.findElement(By.name("password")).sendKeys("nitin");
	driver.findElement(By.className("confirmpassword")).sendKeys("nitin");
	
	
	
}
}
