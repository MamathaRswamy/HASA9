package javaScriptExecutorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClikingOnElementUsingJS {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	WebElement element = driver.findElement(By.linkText("Log in"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", element);
	WebElement email = driver.findElement(By.id("Email"));
	js.executeScript("arguments[0].value='selenium@1234'",email);
	Thread.sleep(2000);
	js.executeScript("arguments[0].value=' '",email);
}
}
