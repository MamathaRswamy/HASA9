package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("123125455");
		driver.findElement(By.name("password")).sendKeys("7332589631");	
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	
	
	}
}
