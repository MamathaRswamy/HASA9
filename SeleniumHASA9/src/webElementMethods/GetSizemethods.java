package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizemethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	WebElement element = driver.findElement(By.id("small-searchterms"));
	System.out.println(element.getSize());
	System.out.println(element.getLocation());
	System.out.println("*********************");
	System.out.println(element.getRect().x);
	System.out.println(element.getRect().y);
	System.out.println(element.getRect().height);
	System.out.println(element.getRect().width);
	driver.quit();
}
}
