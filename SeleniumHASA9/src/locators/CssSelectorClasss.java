package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorClasss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("i love selenium");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
}
}
