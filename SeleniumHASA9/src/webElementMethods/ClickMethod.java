package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginButton = driver.findElement(By.linkText("Log in"));
		loginButton.click();
		WebElement emailTF = driver.findElement(By.id("Email"));
		emailTF.sendKeys("selenium");
		Thread.sleep(200);
		emailTF.clear();
		Thread.sleep(200);
		emailTF.sendKeys("1234");
		//driver.findElement(By.id("Password")).sendKeys("1234567");


}
}
