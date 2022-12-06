package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	WebElement element = driver.findElement(By.id("pollanswers-4"));
	System.out.println(element.isDisplayed());
	System.out.println(element.isEnabled());
	element.click();
	System.out.println(element.isSelected());
	
	driver.quit();
}
}
