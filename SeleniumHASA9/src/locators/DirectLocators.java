package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("Email")).sendKeys("seleni@143");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.className("button-1 login-button")).click();
		driver.findElement(By.tagName("a")).click();
		//Complete text we have to give
		driver.findElement(By.linkText("Log in")).click();
		//By giving part of link Text
		driver.findElement(By.partialLinkText("Log")).click();
	}
}
