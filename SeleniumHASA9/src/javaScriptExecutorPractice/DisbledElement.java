package javaScriptExecutorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisbledElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("file:///C:/Users/User/Desktop/seleniump.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement selenium = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='this is disabled'", selenium);
	
	}
}
