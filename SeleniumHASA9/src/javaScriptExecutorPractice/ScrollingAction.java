package javaScriptExecutorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	JavascriptExecutor js=(JavascriptExecutor) driver;
	//ScrollBy Action
	js.executeScript("window.scrollBy(100,200)");
	Thread.sleep(2000);
	//scrollTo Action
	js.executeScript("window.scrollTo(100,200)");
	Thread.sleep(2000);
	//Refresh Operation
	js.executeScript("history.go()");
	WebElement selenium = driver.findElement(By.id("username"));
	Thread.sleep(2000);
	//Entering data using javascript
	js.executeScript("arguments[0].value='this is disabled'", selenium);
	//clearing data using java script
	js.executeScript("arguments[0].value=' '", selenium);
	//clicking on element using java script
	js.executeScript("arguments[0].click();", selenium);
	
	

}
}
